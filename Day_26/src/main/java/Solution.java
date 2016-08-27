/**
 * 2 6 2014     0
 * 5 7 2014
 * <p>
 * 31 12 2009   0
 * 1 1 2010
 * <p>
 * 1 1 1        0
 * 8 8 8
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
         *Print output to STDOUT.
         *Your class should be named Solution.
         */

        int countA = 3;
        int countE = 3;
        int fine = 0;

        Scanner sc = new Scanner(System.in);

        int[] actuallyReturnedDate = new int[3];
        int[] expectedReturnedDate = new int[3];

        while (countA-- > 0) {
            actuallyReturnedDate[countA] = sc.nextInt();
        }

        while (countE-- > 0) {
            expectedReturnedDate[countE] = sc.nextInt();
        }

        if (expectedReturnedDate[0] > actuallyReturnedDate[0]
                ||
                (
                        expectedReturnedDate[0] == actuallyReturnedDate[0]
                                &&
                                expectedReturnedDate[1] > actuallyReturnedDate[1]
                )
                ||
                (
                        expectedReturnedDate[0] == actuallyReturnedDate[0]
                                &&
                                expectedReturnedDate[1] == actuallyReturnedDate[1]
                                &&
                                expectedReturnedDate[2] >= actuallyReturnedDate[2]
                )
                ) {
            fine = 0;
        } else if (expectedReturnedDate[0] < actuallyReturnedDate[0]) {
            fine = 10000;
        } else if (expectedReturnedDate[1] < actuallyReturnedDate[1]) {
            fine = 500 * (actuallyReturnedDate[1] - expectedReturnedDate[1]);
        } else {
            fine = 15 * (actuallyReturnedDate[2] - expectedReturnedDate[2]);
        }
        System.out.println(fine);
    }
}
