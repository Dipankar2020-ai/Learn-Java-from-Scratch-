You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.

If vowel count > consonant count then print - “Yes”(without quotes).
If vowel count < consonant count then print - “No”(without quotes).
If vowel count = consonant count then print - “Same”(without quotes).
Example 1:

Input:
the quick brown fox jumps over the lazy dog

Output:
No
Solution:
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                v++;
            }
            else if(s.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                c++;
            }
            //System.out.println(v+" "+c);
        }
        
        //Your code here
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
