Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series. 

Example 1:

Input:
A1=2
A2=3
N=4
Output:
5
Explanation:
The series is 2,3,4,5,6....
Thus,4th term is 5.
Solution:
class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        int d=A2-A1;
        int ans=A1+(N-1)*d;
        return ans;
    }
}
