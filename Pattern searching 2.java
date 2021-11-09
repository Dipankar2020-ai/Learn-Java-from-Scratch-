import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String s1=sc.nextLine();
	  String s2=sc.nextLine();
	  int index=s1.indexOf(s2);
//System.out.print(index+" ");
	  while(index>=0 && index<s2.length())
	  {
	      index=s1.indexOf(s2,index);
	      System.out.print(index+" ");
	      index=index+1;
	      
	  }
	  if(index<0)
	     System.out.print(-1);
	}
}
