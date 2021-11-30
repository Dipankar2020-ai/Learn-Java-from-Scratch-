class My
{
    public void display(String str)
    {
        synchronized(this)
        {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
        }
    }
}
class Mythread extends Thread
{
    My m;
    Mythread(My m1)
    {
        m=m1;
    }
    public void run()
    {
        m.display("Hello");
    }
}
class Mythread2 extends Thread
{
    My m;
    Mythread2(My m2)
    {
        m=m2;
    }
    public void run()
    {
        m.display("Welcome");
    }
}
public class Main
{
	public static void main(String[] args) {
		My m=new My();
		Mythread t1=new Mythread(m);
		Mythread2 t2=new Mythread2(m);
		t1.start();
		t2.start();
	}
}
