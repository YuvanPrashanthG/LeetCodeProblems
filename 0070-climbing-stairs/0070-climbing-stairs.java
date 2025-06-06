class Solution {
    public int climbStairs(int n) {
       if (n<= 3) return n;
       int a=2;
       int b=3;
       int fib = 0;
       for (int i = 3;i<n;i++)
       {
            fib = a+b;
            a=b;
            b=fib;
       }
       return fib;
    }
}