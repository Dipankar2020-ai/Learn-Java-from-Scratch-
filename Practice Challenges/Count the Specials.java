Given an array A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.
 

Example:

Input:
N = 5
K = 2
A[] = 1 4 1 2 4
Output:
2
Explanation:
In the given array, 1 and 4 occurs 
floor(5/2) = 2 times. So count is 2.

Solution:
class Outer
{
    static int x=10;
    static class Inner
    {
        void display()
        {
           System.out.println(x);
        }
        
    }
}

public class Main
{
	public static void main(String[] args) {
	   Outer.Inner oi=new Outer.Inner();
	   oi.display();
	   
	   
	}
}
