import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCasesNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCasesNumber; i++) {
            String string = sc.nextLine();
            String resultOdd = "";
            String resultEven = "";
            char[] userInput = string.toCharArray();
            List<Character> odd = new ArrayList<>();
            List<Character> even = new ArrayList<>();
            for (int j = 0; j < string.length(); j++) {
                if (j % 2 == 0) {
                    even.add(userInput[j]);
                } else {
                    odd.add(userInput[j]);
                }
            }
            for (Character s : odd) {
                resultOdd += s;
            }
            for (Character s : even) {
                resultEven += s;
            }
            System.out.println(resultEven + " " + resultOdd);
        }
    }
}