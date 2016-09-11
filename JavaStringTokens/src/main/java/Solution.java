import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        String[] array = s.trim().split("[ !,?\\._'@]+", 0);

        if (array.length == 1 && array[0].equals("")) {

            System.out.println(0);

        } else {

            System.out.println(array.length);

            for (String anArray : array) {

                System.out.println(anArray);

            }
        }
    }
}