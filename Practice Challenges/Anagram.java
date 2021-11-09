Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.

Example 1:

Input:
a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same
characters with same frequency. So, 
both are anagrams.

Solution:
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s1,String s2)
    {
        
       int sum=0,sum1=0;
		for(int i=0;i<s1.length();i++)
		{
		    sum=sum+(int)s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
		    sum1=sum1+(int)s2.charAt(i);
		}
		int ans1=sum1-sum;
		if(ans1==0)
		{
		    return true;
		}
		else
		{
		    return false;
		}
        
    }
}
