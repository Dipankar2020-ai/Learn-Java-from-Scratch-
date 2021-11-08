I/P:"12.5318"
O/P:5318
Solution:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int index=s1.indexOf('.');
	    System.out.println(s1.substring(index+1));
	}
}
