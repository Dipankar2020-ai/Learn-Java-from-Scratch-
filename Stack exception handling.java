class Stackover extends Exception
{
    public String toString()
    {
        return "The stackOverflow occurs";
    }
}
class Stackunderflow extends Exception
{
    public String toString()
    {
        return "The Stackunderflow occurs";
    }
}
class Stack
{
    int size,top=-1;
    int arr[];
    Stack(int len)
    {
        size=len;
        arr=new int[size];
    }
    void push(int ele) throws Stackover
    {
        if(top==size-1)
        {
            throw new Stackover();
        }
        top=top+1;
        arr[top]=ele;
    }
    int pop() throws Stackunderflow
    {
        if(top==-1)
        {
            throw new Stackunderflow();
        }
        
        int x=arr[top];
        top=top-1;
        return x;
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Stack st=new Stack(3);
		try
		{
		st.push(10);
		st.push(12);
		st.push(10);
		st.push(12);
		}
		catch(Stackover e)
		{
		    System.out.println(e);
		}
	}
}
