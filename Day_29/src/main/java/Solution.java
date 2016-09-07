import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        TreeSet<Integer> treeSet = new TreeSet<>();

        int testCases = sc.nextInt();
        int N;
        int K;
        int bool;
        int comparator;

        for (int i = 0; i < testCases; i++) {

            N = sc.nextInt();
            K = sc.nextInt();
            comparator = 0;


            for (int j = 1; j < N; j++) {

                for (int k = j + 1; k <= N; k++) {

                    bool = j & k;

                    if ((j < k) && ((bool) < K)) {
//                        list.add(bool);
//                        treeSet.add(bool);
                        if ((j & k) > comparator) {
                            comparator = j & k;
                        }
                    }
                }
            }

//            Collections.sort(list);
//
//            System.out.println(list.get(list.size() - 1));
//
//            list.clear();

//            System.out.println(treeSet.last());

//            treeSet.clear();

            System.out.println(comparator);

        }
    }
}