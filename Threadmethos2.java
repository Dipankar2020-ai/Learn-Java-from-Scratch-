class My extends Thread
{
    My(String name)
    {
        super(name);
    }
}

public class Main
{
	public static void main(String[] args) {
		My m=new My("Raju");
		m.start();
		System.out.println("Name=>"+m.getName());
		System.out.println("Id=>"+m.getId());
		System.out.println("Priority=>"+m.getPriority());
		System.out.println("State=>"+m.getState());
		System.out.println("Alive=>"+m.isAlive());
		
	}
}
