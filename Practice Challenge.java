Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Solution:
class Solution {
    int isPalindrome(String S) {
        boolean flag=true;
        char a[]=S.toCharArray();
        int len=a.length;
        char b[]=new char[len];
        for(int i=0;i<len;i++)
        {
            b[i]=a[len-i-1];
        }
       
        for(int k=0;k<len;k++)
        {
           if(a[k]!=b[k])
           {
               return 0;
           }
        }
        return 1;
    }
};
