class Atm
{
   synchronized public void checkbalance(String name)
    {
        System.out.print(name+" Checking");
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            
        }
        System.out.println(" Balance");
    }
   synchronized public void withdrawbalance(String name,int amount)
    {
        System.out.print(name+" withdrwaing ");
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            
        }
        System.out.println(amount);
        
    }
}
class Customer extends Thread
{
    String name;
    Atm atm1;
    int amount;
    Customer(String n,Atm a,int am)
    {
        name=n;
        atm1=a;
        amount=am;
    }
    public void useatm()
    {
        atm1.checkbalance(name);
        atm1.withdrawbalance(name,amount);
    }
    public void run()
    {
        useatm();
    }
}
public class Main
{
	public static void main(String[] args) {
	    Atm a=new Atm();
	    Customer c1=new Customer("Dipankar",a,1000);
	    Customer c2=new Customer("Raju",a,2000);
	    c1.start();
	    c2.start();
	
	}
}
