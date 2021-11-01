Given two numbers a and b, you need to swap their values so a holds the value of b and b holds the value of a.
Example 1:

Input:
a = 1
b = 2
Output: 
2 1
Explanation: Initially a = 1 and b = 2,
now a = 2 and b = 1.
Example 2:

Input:
a = 6 
b = 7 
Output: 7 6 
Explanation: Initially a = 6 and b = 7,
now a = 7 and b = 6.

Your Task: 
Just write the code to swap values of a and b at the specified place. The input and output are done automatically.

Solution:
class Solution
{
    public void utility(int a, int b){
    a=a^b;
    b=a^b;
    a=a^b;
        
        
        System.out.println(a+" "+b);
    }
}
