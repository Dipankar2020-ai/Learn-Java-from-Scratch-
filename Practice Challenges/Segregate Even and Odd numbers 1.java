Given an array Arr[], write a program that segregates even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

Example 1:

Input: 
N = 7
Arr[] = {12, 34, 45, 9, 8, 90, 3}
Output: 8 12 34 90 3 9 45
Explanation: Even numbers are 12, 34,
8 and 90. Rest are odd numbers. After
sorting even numbers 8 12 34 90 and 
after sorting odd numbers 3 9 45. Then
concat both.

Solution:

class Solution {
    void segregateEvenOdd(int arr[], int n) {
      Arrays.sort(arr);
      int brr[]=new int[n];
      int j=0;
      for(int i=0;i<n;i++)
      {
          if(arr[i]%2==0)
          {
              brr[j]=arr[i];
              j++;
          }
          
      }
      for(int i=0;i<n;i++)
      {
          if(arr[i]%2==1)
          {
              brr[j]=arr[i];
              j++;
          }
      }
       for(int i=0;i<n;i++)
       {
          arr[i]=brr[i];
       }
      
    }
}
