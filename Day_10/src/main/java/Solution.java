import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> onesCount = new ArrayList<>();
        int n = sc.nextInt();

        int counter = 0;
        boolean isOne = false;
        String binaryString = Integer.toBinaryString(n);

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == 49) {
                if (isOne == false) {
                    isOne = true;
                }
                counter++;
                onesCount.add(counter);
            } else {
                if (isOne == true) {
                    isOne = false;
                    onesCount.add(counter);
                    counter = 0;
                }
            }
        }
        System.out.println(Collections.max(onesCount));
    }
}
