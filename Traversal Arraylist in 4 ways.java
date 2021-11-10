import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		for(int i=0;i<al.size();i++)   //Normal way
		{
		    System.out.print(al.get(i)+" ");
		}
	    System.out.println();
		for(Integer i: al)            //ForEach loop
		   System.out.print(i+" ");
		 Iterator it=al.iterator();//iterator
		 System.out.println();
		 while(it.hasNext())
		 {
		     System.out.print(it.next()+" ");
		 }
		  System.out.println();
		  al.forEach(x->System.out.print(x+" "));//ForEach method
		  System.out.println();
		  for(int i=0;i<al.size();i++)
		  {
		      int x=al.get(i);
		      al.set(i,x*2);
		  }
		  System.out.println(al);
    		
	}
}
