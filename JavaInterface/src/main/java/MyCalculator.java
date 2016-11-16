class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        if(n==1) return 1;
        int maxD = (int)Math.sqrt(n);
        int sum=1;
        for(int i = 2; i <= maxD; i++)
        {
            if(n % i == 0)
            {
                sum += i;
                int d = n/i;
                if(d!=i)
                    sum+=d;
            }
        }
        return sum+n;
    }
}
