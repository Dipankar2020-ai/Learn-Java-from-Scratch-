import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		int x=sc.nextInt();
		al.add(8);
		al.add(100);
		al.add(20);
		al.add(40);
		al.add(3);
		al.add(7);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
		    int y=(Integer)it.next();
		    if(y>x)
		        it.remove();
		}
		System.out.println(al);
	
    		
	}
}
