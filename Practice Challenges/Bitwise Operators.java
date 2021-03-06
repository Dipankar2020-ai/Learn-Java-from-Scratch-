Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.

Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. e = ~e
Note: ^ is for xor.

Example 1:

Input:
4 8 2

Output:
0
10
0
2
-11
  
  Solution:
class Geeks {
    static void bitWiseOp(int a, int b, int c) {
    int d=a^a;
    int e=c^b;
    int f=a & b;
    int g=c | (a^a);
    int h=~e;
    System.out.println(d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
    }
}
