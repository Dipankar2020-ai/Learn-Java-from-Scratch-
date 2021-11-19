Given two strings s1 and s2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make s1 equal to s2.

Example:

Input:
s1 = madame
s2 = madam
Output:
1
Explanation:
String s1 = madame, string s2 = madam. 
character 'e' in first string needs to 
be deleted to make s1 equal to s2.

Solution:
class Solution
{
    public int countChars(String s1, String s2)
    {
       int h1[]=new int[257];
       int h2[]=new int[257];
       int n1=s1.length();
       int n2=s2.length();
       for(int i=0;i<n1;i++)
       {
           h1[s1.charAt(i)]++;
       }
       for(int i=0;i<n2;i++)
       {
           h2[s2.charAt(i)]++;
       }
       int count=0;
       for(int i=0;i<257;i++)
       {
           count=count+Math.abs(h1[i]-h2[i]);
       }
       return count;
    }
}
