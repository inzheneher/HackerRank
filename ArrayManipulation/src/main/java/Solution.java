import java.io.*;
import java.util.*;

public class Solution {

    // Complete the arrayManipulation function below. 7542539201
    static long arrayManipulation(int n, int[][] queries) {

        long max = 0;
        long[] row = new long[n];

        List<Long> longList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            longList.add(0L);
        }

        List<List<Integer>> arraysList2D = new ArrayList<>();
        for (int[] ints : queries) {
            List<Integer> eachRecord = new ArrayList<>();
            for (int anInt : ints) {
                eachRecord.add(anInt);
            }
            arraysList2D.add(eachRecord);
        }

        for (List<Integer> integers : arraysList2D) {
            for (int i = integers.get(0) - 1; i < integers.get(1); i++) {
                longList.set(i, longList.get(i) + integers.get(2));
                if (longList.get(i) > max) max = longList.get(i);
            }
        }
        return max;
    }

    private static Scanner scanner;

    static {
        try {
            scanner = new Scanner(new File("/home/inzheneher/WORK/TEST/HackerRank/ArrayManipulation/src/main/resources/input07.txt"));
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
