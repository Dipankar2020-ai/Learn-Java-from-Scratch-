class Circle 
{
    int radius;
    double area()
    {
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle
{
    int height;
    Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    double volume()
    {
        return area()*height;
    }
}
public class Main
{
	public static void main(String[] args) {
	   Cylinder cy=new Cylinder(10,5);
	   
	   System.out.println(cy.area());
	   System.out.println(cy.volume());
	}
}
