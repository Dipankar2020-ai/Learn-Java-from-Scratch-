abstract class A
{
    A()
    {
        System.out.println("A is called");
    }
    public void meth1()
    {
        System.out.println("method 1  is called");
    }
    abstract void meth2();
    
}
class B extends A
{
     public void meth2()
     {
         System.out.println("Method 2 is called");
     }
}
public class Main
{
	public static void main(String[] args) {
		A a=new B();
		a.meth1();
		a.meth2();
	}
}
