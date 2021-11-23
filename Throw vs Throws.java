
public class Main
{
    public static int meth2(int l,int b) throws Exception
    {
        if(l<=0 || b<=0)
        {
            throw new Exception("Length can't be negative");
        }
        int a=l*b;
        return a;
        
    }
    public static int meth1()
    {
        try
        {
            int a=meth2(-5,3);
            return a;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
        
    }
	public static void main(String[] args) {
		int a=meth1();
		if(a==0)
		{
           System.out.println("The area can't be negative");		    
		}
		else
		{
		    	System.out.println("The area is "+a);
		}
	
	}
}
