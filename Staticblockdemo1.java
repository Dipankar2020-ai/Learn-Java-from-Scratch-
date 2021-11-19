class Test
{
    static int s;
    static
    {
        s=5;
        System.out.println("Block a is present");
    }
    static
    {
        System.out.println(s);
        System.out.println("Block b is present");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Test t=new Test();
		System.out.println("Hello Main");
	}
}
