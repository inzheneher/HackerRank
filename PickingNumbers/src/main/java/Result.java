import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> sortedList = a.stream().sorted().collect(toList());

        List<Integer> tempList = new ArrayList<>();
        List<List<Integer>> subArrayList = new ArrayList<>();

        for (int i = 0; i < sortedList.size(); i++) {
            if (tempList.size() > 0) {
                if (sortedList.get(i) - tempList.get(0) > 1) {
                    subArrayList.add(tempList);
                    tempList = new ArrayList<>();
                }
                if (i + 1 == sortedList.size()) {
                    tempList.add(sortedList.get(i));
                    subArrayList.add(tempList);
                    break;
                }
            }
            tempList.add(sortedList.get(i));
        }

        subArrayList.sort(Comparator.comparingInt(List::size));

        return subArrayList.get(subArrayList.size() - 1).size();
    }

}