import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String string = sc.nextLine();
            int number = Integer.parseInt(string);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
