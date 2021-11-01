You are given two integer variables x and y. You need to perform the following operations:

p = x + y : Addition
q = x - y : Subtraction
r = x * y :Multiplication
s = x / y : Division
t = x % y : Modulo

Example 1:

Input:
x = 1
y = 2
Output: 
3 -1 2 0 1 
Explanation: The given operations are
performed.
Example 2:

Input:
x = 3 
y = 4 
Output: 
7 -1 12 0 3 
Explanation: The given operations are
performed

Your Task: 
Just complete the mentioned code snippets. The input and output are already done by the given code.

Solution:

public  static  void utility(int x, int y){
    //Perform addition x+y below
    int p = x+y;
    //Perform subtraction x-y below
    int q = x-y;
    //Perform multiplication x*y below
    int r =x*y; 
    //Perform division x/y below
    int s =x/y;
    //Perform modulo operation x%y below
    int t = x%y;

    //The below code prints the output. Don't change it!
    System.out.println(p + " " + q + " " + r + " " + s + " " + t);
}
