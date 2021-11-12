class Parent
{
    void display()
    {
        System.out.println("Hello");
    }
}
class Child extends Parent
{
    void display()
    {
        System.out.println("Hello World");
    }
}
public class Main
{
	public static void main(String[] args) {
	   Parent p=new Parent();
	   p.display();
	   Child ch=new Child();//Method Overriding
	   ch.display();
	   Parent p1=new Child();//Dynamic method dispatch
	   p1.display();
	}
}
