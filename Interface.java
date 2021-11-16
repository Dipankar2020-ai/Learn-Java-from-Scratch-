interface Test
{
    void meth1();
    void meth2();
}
class My implements Test
{
    public void meth1()
    {
        System.out.println("In the method1 of My");
    }
    public void meth2()
    {
        System.out.println("In the method2 of My");
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t=new My();
		t.meth1();
		t.meth2();
	}
}
