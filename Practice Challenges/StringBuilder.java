public class Main
{
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("geeks");
		StringBuilder s2=s1;
		s1=s1.append("Forgeeks");
		if(s1==s2)
		{
		    System.out.println("Same");
		}
		else{
		    System.out.println("Not same");
		}
	}
}

o/p-Same
