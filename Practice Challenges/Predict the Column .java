Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.

Example:

Input:
N = 3
M[][] = {{1, 1, 0},
         {1, 1, 0},
         {1, 1, 0}}
Output:
2
Explanation:
2nd column (0-based indexing) is having 
3 zeros which is maximum among all columns.
 
Solution:
class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int count =-99999, colume=0;
        for(int i=0;i<N;i++)
        {
            int curr=0;
            for(int j=0;j<N;j++)
            {
                if(arr[j][i]==0)
                {
                    curr++;
                }
            }
            if(curr>count)
            {
                count=curr;
                colume=i;
            }
        }
        return colume; 
        
        
    }
}
