class Parent
{
    Parent()
    {
        System.out.println("In parent class");
    }
}
class Child extends Parent
{
    Child(int a)
    {
        System.out.println("In child class");
    }
}
public class Main
{
	public static void main(String[] args) {
	Child ch=new Child(5);
	}
}
