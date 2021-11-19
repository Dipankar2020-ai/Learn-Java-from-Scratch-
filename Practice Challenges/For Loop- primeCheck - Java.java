Here, we will use for loop and check if the given number n is prime or not.
Note: A number is prime if it's divisible by itself and 1. Also, 1 is not prime.

Example 1:

Input:
1

Output:
No

Solution:
class Geeks {
    static void isPrime(int n) {
        boolean flag=true;
        if(n==1)
        {
            flag=false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n%i==0)
            {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        
    }
}
