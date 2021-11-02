Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be 
2, 4, 6, 8, 10, 12, 14.
Solution:
class Solution{   
public:
    int findMissing(int arr[], int n) {
      int d=arr[1]-arr[0],value=0;
      if(n==2)
      {
          value=(arr[0]+arr[1])/2;
          return value;
      }
      
      for(int i=1;i<n-1;i++)
      {
          if((arr[i+1]-arr[i])<d)
          {
              d=arr[i+1]-arr[i];
          }
      }
      
      for(int i=0;i<n-1;i++)
      {
          if((arr[i+1]-arr[i])!=d)
          {
              value=arr[i]+d;
          }
      }
      return value;
        // code here
    }
};
