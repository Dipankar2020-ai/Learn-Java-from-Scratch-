Given N, find s such that sum of first s natural number is N.
 

Example 1:

Input: N = 10
Output: 4
Explanation: Sum of first 4 natural
number is 1 + 2 + 3 + 4 = 10.     
Example 2:

Input: N = 17
Output: -1
Explanaion: There is no such number.
 

Your Task:
You don't need to read or print anyhting. Your task is to complete the function find() which takes N as input parameter and returns s. If not possible return -1.
 

Expected Time Complexity: O(log(N))
Expected Space Complexity: O(1)

Constraints:
1 <= N <= 10^9

Solution:
class Solution
{
    public int find(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int sum=0,i=1;
        while(sum<n)
        {
            
            sum=sum+i;
          
            if(sum==n)
            {
                return i;
            }
             i++;
            if(sum>n)
            {
                return -1;
            }
        }
        return 0;
    }
}
