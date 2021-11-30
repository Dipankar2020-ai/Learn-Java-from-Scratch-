class My extends Thread
{
    public void run()
    {
        int x=1;
        while(true) 
        {
            System.out.println(x+". Hello");
            x++;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		My m=new My();
		m.start();
		int count=1;
		while(true)
		{
		    System.out.println(count+". Main");
		    count=count+1;
		    Thread.yield();
		}
	}
}
