import java.util.Scanner;

class Calculator {
    int power;
    int n;
    int p;

    int power(int n, int p) throws Exception {
        this.n = n;
        this.p = p;
        this.power = this.n;

        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else if (p == 0) {
            return 1;
        } else {
            for (int i = 0; i < p - 1; i++) {
                power *= n;
            }
        }
        return power;
    }
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
