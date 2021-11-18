abstract class My
{
    abstract void display();
}
class Test
{
    public void meth()
    {
    My m=new My()
    {
        public void display()
        {
            System.out.println("Hello");
        }
    };
    m.display();
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t=new Test();
		t.meth();
	}
}
