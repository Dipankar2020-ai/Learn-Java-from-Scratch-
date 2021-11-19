You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

Example 1:

Input:
xxyy

Output:
1

Solution:
class Geeks{
    
    static void follPatt(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0)
            {
                if(s.charAt(i)=='x' && s.charAt(i-1)=='y' && count!=0)
                {
                    break;
                }
                
            }
            if(s.charAt(i)=='x')
            {
                count=count+1;
            }
            else if(s.charAt(i)=='y')
            {
                count=count-1;
            }
        }
        if(count!=0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1); 
        }
       
      
    }
}
