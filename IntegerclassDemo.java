public class Main
{
	public static void main(String[] args) {
	    int m=10;
	   Integer i=Integer.valueOf(m);//Auto boxing
	   Integer n=10;
	   int p=i;//Auto unboxing
	  System.out.println(n.equals(i));
	  Integer g=Integer.valueOf("1010",2);
	  System.out.println(g);
	  System.out.println(Integer.parseInt("123"));
	  System.out.println(Integer.toBinaryString(40));
	   
	}
}
