
Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Example 1:

Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number
of fibonacci series.

Solution:
class Solution {
    static long nthFibonacci(long n){
        // code here
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        long a=0,b=1,c=0,mod=1000000007;
        for(int i=2;i<=n;i++)
        {
            c=(a+b)%mod;
            a=b;
            b=c;
            
        }
        return c;
    }
}
