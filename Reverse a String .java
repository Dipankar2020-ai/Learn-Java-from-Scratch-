You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG

Solution:
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int len=str.length();
        String ans="";
        for(int i=0;i<len;i++)
        {
            ans=ans+str.charAt(len-i-1);
        }
        return ans;
    }
}
