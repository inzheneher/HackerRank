import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int initialNumberOfElements = sc.nextInt();

        List<Integer> listOfElements = new ArrayList<>();

        for (int i = 0; i < initialNumberOfElements; i++) {
            listOfElements.add(sc.nextInt());
        }

        int numberOfQueries = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < numberOfQueries; i++) {

            /*execute queries*/

            if (sc.nextLine().equals("Insert")) {
                listOfElements.add(sc.nextInt(), sc.nextInt());
            } else if (sc.nextLine().equals("Delete")) {
                listOfElements.remove(sc.nextInt());
            }
            sc.nextLine();
        }

        sc.close();

        /*fill the list*/
        listOfElements.forEach(item -> System.out.print(item + " "));

        for (int i = 0; i < listOfElements.size(); i++) {
            System.out.print(listOfElements.get(i) + " ");
        }

    }
}