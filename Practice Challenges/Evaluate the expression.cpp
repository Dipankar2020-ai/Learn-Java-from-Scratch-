Given a number n, find the value of below expression:
            f(n-1)*f(n+1) - f(n)*f(n)    where f(n) is nth Fibonacci. 
 

Example 1:

Input : n = 5
Output: -1
Explanation: f(4) = 3, f(5) = 5
f(6) = 8. 3 * 8 - 5 * 5 = -1
Example 2:

Input: n = 3
Output: 1
Explanation: f(2) = 1, f(3) = 2
and f(4) = 3. 1 * 3 - 2 * 2 = -1
 

Your Task:
You don't need to read or print anything. Yous task is to complete the function evaluate_exp() which takes n as input parameter and returns the value of the given expression.
 

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)
  Solution:
class Solution{
	public:
	int f(int n)
	{
	    int a=0;
	    int b=1;
	    int c=0;
	    if(n==0||n==1)
	    {
	        return n;
	    }
	    for(int i=2;i<=n;i++)
	    {
	        c=a+b;
	        a=b;
	        b=c;
	        
	    }
	    return c;
	}
   	int evaluate_exp(int n){
   	    int ans1=f(n-1)*f(n+1)-f(n)*f(n);
   	    return ans1;
   	}    
};
