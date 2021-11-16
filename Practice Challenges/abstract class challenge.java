abstract class Shape
{
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shape
{
    int radius;
    double area;
    double peri;
    Circle(int r)
    {
        radius=r;
    }
    void perimeter()
    {
        peri=2*3.14*radius;
        System.out.printf("%.2f\n",peri);
    }
    void area()
    {
        area=3.14*radius*radius;
        System.out.println(area);
    }
}
class Rectangle extends Shape
{
    int length,breadth;
    double area,peri;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void perimeter()
    {
        peri=2*(length+breadth);
        System.out.println(peri);
    }
    void area()
    {
        area=length*breadth;
        System.out.println(area);
    }
}
public class Main
{
	public static void main(String[] args) {
		Shape s=new Circle(5);
		s.area();
		s.perimeter();
		Shape r=new Rectangle(5,6);
		r.area();
		r.perimeter();
		
		
	}
}
