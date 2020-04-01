import java.io.*;
import java.util.Scanner;

public class Solution {

    // Complete the arrayManipulation function below. 7542539201
    static long arrayManipulation(int n, int[][] queries) {

        long max = 0;
        long[] row = new long[n];


        for (int[] query : queries) {
            for (int i1 = query[0] - 1; i1 < query[1]; i1++) {
                row[i1] = row[i1] + query[2];
                if (row[i1] > max) max = row[i1];
            }
        }
        return max;
    }

    private static Scanner scanner;

    static {
        try {
            scanner = new Scanner(new File("/home/inzheneher/WORK/TEST/HackerRank/ArrayManipulation/src/main/resources/input04.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
