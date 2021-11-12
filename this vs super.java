class Rectangle
{
    int length,breadth;
    int x=10;
    Rectangle(int length,int breadth )
    {
        this.length=length;
        this.breadth=breadth;
    }
}
class Cuboid extends Rectangle
{
    int x=20;
    int height;
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(length*height*breadth);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Cuboid cb=new Cuboid(2,3,5);
		cb.display();
	}
}
