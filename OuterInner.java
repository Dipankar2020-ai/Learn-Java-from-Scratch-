class Outer
{
    int y=6;
    class Inner
    {
        int x=5;
        void display()
        {
            System.out.println(x+" "+y);
        }
    }
    void display()
    {
        Inner i=new Inner();
        System.out.println(i.x+" "+y);
        i.display();
    }
}
public class Main
{
	public static void main(String[] args) {
		Outer o=new Outer();
		o.display();
		Outer.Inner oi=new Outer().new Inner();
		oi.display();
	}
}
