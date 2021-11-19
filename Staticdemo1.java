class Hondacity
{
    static double price=10;
    int a,b;
    static double onroadprice(String str)
    {
        switch(str)
        {
            case "Delhi":
                price=price*6.7+price;
                return price;
            case "Mumbai":
                price=price*9.8+price;
                return price;
        }
        return 0;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println(Hondacity.onroadprice("Mumbai"));
		System.out.println(Hondacity.price);
	}
}
