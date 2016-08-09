import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(factorial(number));
    }

    static Integer factorial (int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
            return fact;
    }
}
