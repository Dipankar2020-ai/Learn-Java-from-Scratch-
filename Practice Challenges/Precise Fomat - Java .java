There are times when your answer is a floating point that contains undesired amount of digits after decimal. Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b. You need to output a/b and decimal precision of a/b upto 3 places after decimal point.
Note: You may use System.out.format()

Example 1:

Input:
5.43 2.653

Output:
2.046739 2.047
  
Solution:
class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        
        System.out.print(result+" ");
        System.out.printf("%.3f",result);
        // Your code here to print upto 3 decimal places
        
    }    
    
}
