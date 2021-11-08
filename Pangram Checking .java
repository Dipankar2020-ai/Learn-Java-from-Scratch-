Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Example 1:

Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Explantion: In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.
 
Solution:
class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
     
     int n=str.length();
     if(n<26)
     {
         return false;
     }
     boolean visited[]=new boolean[26];
     for(int i=0;i<n;i++)
     {
         char x=str.charAt(i);
         if(x>='a' && x<='z')
         {
             visited[x-'a']=true;
         }
         if(x>='A' && x<='Z')
         {
             visited[x-'A']=true;
         }
         
     }
     for(int i=0;i<26;i++)
     {
         if(visited[i]==false)
         {
             return false;
         }
         
     }
     return true;
    }
}
