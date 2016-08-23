import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{

    int n;

    @Override
    public int divisorSum(int n) {

        int sum;

        if (n == 1) {
            sum = 1;
        } else {
            this.n = n;

            int maxD = (int)Math.sqrt(this.n);
            sum = this.n + 1;
            for(int i = 2; i <= maxD; i++)
            {
                if(this.n % i == 0)
                {
                    sum += i;
                    int d = this.n/i;
                    if(d!=i)
                        sum+=d;
                }
            }
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
