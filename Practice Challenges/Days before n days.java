import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int x=n%7;
		int ans=d-x;
		if(ans>0)
		{
		    System.out.println(ans);
		}
		else
		{
		    System.out.println(ans+7);
		}
	}
}
