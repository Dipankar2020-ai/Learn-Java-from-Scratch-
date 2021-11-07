Given a positive integer, N. Find the factorial of N.
 

Example 1:

Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
  
Solution:
class Solution{
    static long factorial(int N){
        long fact=1;
        for(long i=1;i<=N;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
