class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance should not be less than 5000";
    }
}
public class Main
{
    public static void fun3()
    {
       
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }
    public static void fun2()
    {
        fun3();
    }
    public static void fun1()
    {
        fun2();
    }
	public static void main(String[] args) {
		fun1();
	}
}
