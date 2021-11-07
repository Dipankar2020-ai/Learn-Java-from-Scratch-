Given two positive integers A and B, find GCD of A and B.


Example 1:

Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
  
Solution:
class Solution
{
	public:
    int gcd(int A, int B) 
	{ 
	    int R;
	    while(A%B>0)
	    {
	        R=A%B;
	        A=B;
	        B=R;
	    }
	    return B;
	      
	} 
};
