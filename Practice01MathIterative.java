public class Practice01MathIterative implements Practice01Math
{
    public int fib (int n) throws Exception
    {
        int prevSum1 = 0;
        int prevSum2 = 1;
        int sum = 0;
        if (n < 0)
            throw new Exception();
        else if (n == 0 || n == 1)
            return n;
        for (int i = 1; i < n; i++)
        {
            sum = prevSum1 + prevSum2;
            prevSum1 = prevSum2;
            prevSum2 = sum;
        }
        return sum;
    }
    public int fact (int n) throws Exception
    {
        int sum = n;
        if (n < 0)
            throw new Exception();
        else if (n == 0 || n == 1)
            return 1;
        for (int i = n-1; i > 0; i--)
            sum *= i;
        return sum;
    }
}