Logical operators are used when we want to check the truth value of certain statements. Logical operators help us in checking multiple statements together for their truthness.

Here we will learn logical operators like AND(&&), OR(||), NOT(!). These operators produce either a true or a false as an output.

Example 1:

Input:
true false

Output:
false true false


Explanation:

true&&false=>false

true||false=>true

!(true) && !(false)=>false
Example 2:

Input:
true true

Output:
true true false
Your Task:
Your task is to complete the function logicOp() which takes a and b as a parameter and prints (a AND b), (a OR b), (a NOT b) in separated by space.

Solution:
class Geeks{
    
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        boolean ans=a&&b;
        boolean ans1=a||b;
        boolean ans2=((!a) && (!b));
        System.out.print(ans+" "+ans1+" "+ans2);
     
    }
}
