import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String A, String B) {
        //Complete the function

        char[] word1 = A.toLowerCase().replaceAll("[\\s+]", "").toCharArray();
        char[] word2 = B.toLowerCase().replaceAll("[\\s+]", "").toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        String a = String.valueOf(word1);
        String b = String.valueOf(word2);

        return a.equalsIgnoreCase(b);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}