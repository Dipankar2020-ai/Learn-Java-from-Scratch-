import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		     int a[]={10,0,30,40,50};
		     
		     
		     //System.out.println(c);
		     try
		     {
		     int c=a[0]/a[1];
		     }
		     catch(ArithmeticException e1)
	      	 {
		    System.out.println("undefined");
		     }
		      
		    int d=a[10]/a[5];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		    System.out.println("Bounding checking error");
		}
	
	  
	
	
		
	}
}
