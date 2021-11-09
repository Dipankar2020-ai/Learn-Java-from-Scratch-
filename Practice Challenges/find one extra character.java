import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
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
		System.out.println((char)ans1);
	}
}
