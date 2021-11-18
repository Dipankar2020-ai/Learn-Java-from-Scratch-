class Outer
{
    static int x=10;
    static class Inner
    {
        void display()
        {
           System.out.println(x);
        }
        
    }
}

public class Main
{
	public static void main(String[] args) {
	   Outer.Inner oi=new Outer.Inner();
	   oi.display();
	   
	   
	}
}
