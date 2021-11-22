import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		     int a=sc.nextInt();
		     int b=sc.nextInt();
		     double c=(double)a/b;
		     System.out.println(c);
		}
		catch(ArithmeticException e)
		{
		    System.out.println("undefined");
		}
	
		
	}
}
