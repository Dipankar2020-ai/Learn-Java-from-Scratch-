import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("geeks");
		al.add("ide");
		al.add("Courses");
		System.out.println(al.contains("ide"));
		al.remove(1);
		System.out.println(al.contains("ide"));
		al.remove("Courses");
		System.out.println(al.contains("Courses"));
	
	}
