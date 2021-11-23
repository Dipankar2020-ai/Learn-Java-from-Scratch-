public class Main
{
    
    public static void meth1()throws Exception
    {
        try
         {
             int a=10/0;
             throw new Exception();
         }
         finally
         {
             System.out.println("i am Dipankar");
         }
        
    }
	public static void main(String[] args) {
	      try
	      { 
	          meth1();
	          
	      }
	      catch(Exception e)
	      {
	          System.out.println(e);
	      }
	}
}
