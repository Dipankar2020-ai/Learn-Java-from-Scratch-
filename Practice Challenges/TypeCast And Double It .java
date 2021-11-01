Given an input num as a string. You need to typecast into an integer and double it.

Example 1:

Input:
num = 5
Output: 
10
Explanation: Just typecast and double it.

Your Task: 
Just write the syntax to typecast num and double it. The input and output are handled by the given code itself.
Solution:
public static void utility(String num){
    
    //Complete the syntax below. Convert num to int and double it
    int ans =Integer.parseInt(num);
    int ans1=ans*2;
            
    System.out.println(ans1);
}

