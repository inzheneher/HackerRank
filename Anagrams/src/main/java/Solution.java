import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        int counter = 0;

        for (int k = 0; k < s.length() - 1; k++) {
            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length() - k; j++) {
                    String substring1 = s.substring(i, i + 1 + k);
                    String substring2 = s.substring(j, j + 1 + k);

                    char[] subStrChar1 = substring1.toCharArray();
                    char[] subStrChar2 = substring2.toCharArray();

                    Arrays.sort(subStrChar1);
                    Arrays.sort(subStrChar2);

                    if (Arrays.equals(subStrChar1, subStrChar2)) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}