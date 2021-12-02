class Myobject
{
    public String toString()
    {
        return "dipankar";
    }
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Myobject o)
    {
        return this.hashCode()==o.hashCode();
    }
}

public class Main
{
	public static void main(String[] args) {
	   Myobject o1=new Myobject();
	   System.out.println(o1);
	   Myobject o2=new Myobject();
	   System.out.println(o1.equals(o2));
	}
}
