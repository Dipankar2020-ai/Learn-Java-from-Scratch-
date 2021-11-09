class Player
{
    int a,b;
    private static int playercount=0;
    Player(int a,int b)
    {
        this.a=a;
        this.b=b;
        playercount++;
    }
    static int  value()
    {
       return playercount;
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println(Player.value());
		Player p1=new Player(10,20);
			System.out.println(Player.value());
	}
}
