class Rectangle
{
    int length,breadth;
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
}
class Cylinder extends Rectangle
{
    int height;
    Cylinder()
    {
        height=1;
    }
    Cylinder(int h)
    {
         height=h;
    }
    Cylinder(int l,int b,int h)
    { 
        super(l,b);
        height=h;
        
    }
    int volume()
    {
        return length*breadth*height;
    }
}
public class Main
{
	public static void main(String[] args) {
		Cylinder cl=new Cylinder();
		System.out.println(cl.volume());
		Cylinder cl1=new Cylinder(5);
		System.out.println(cl1.volume());
		Cylinder cl2=new Cylinder(5,6,7);
		System.out.println(cl2.volume());
		
	}
}
