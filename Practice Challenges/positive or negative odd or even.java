import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n==0)
	    {
	        System.out.println("Zero");
	    }
	    else if(n>0)
	    {
	        if(n%2==0)
	        {
	            System.out.println("Positive Even");
	        }
	        else{
	            System.out.println("Positive Odd");
	        }
	    }
	    else{
	        if(n%2==0)
	        {
	            System.out.println("Negative Even");
	        }
	        else{
	            System.out.println("Negative Odd");
	        }
	        
	    }
	
	}
}
