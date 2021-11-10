import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		System.out.println(al.get(1));
		al.set(1,40);
		System.out.println(al.get(1));
	    System.out.println(al.indexOf(10));
	    System.out.println(al.lastIndexOf(10));
	    System.out.println(al.indexOf(70));
		
		
	}
}
