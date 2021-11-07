For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.
 

Example 1:

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.

Solution:
class Solution{
    static int isPrime(int N){
        // code here
        if(N==1)
        {
            return 0;
        }
        else
        {
        for(int i=2;i*i<=N;i++)
        {
            if(N%i==0)
            {
                return 0;
            }
        }
        return 1;
        }
    }
}
