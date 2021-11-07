Given a stream of incoming numbers, find average or mean of the stream at every point.

 

Example 1:

Input:
n = 5
arr[] = {10, 20, 30, 40, 50}
Output: 10.00 15.00 20.00 25.00 30.00 
Explanation: 
10 / 1 = 10.00
(10 + 20) / 2 = 15.00
(10 + 20 + 30) / 3 = 20.00
And so on.
  
Solution:
class Solution{
public:	
	// Find the sum of all non-repeated elements
	// in an array
	int findSum(int arr[], int n) {
	        int sum = 0;

	    // Hash to store all element of array
	    unordered_set<int> s;
	    for (int i = 0; i < n; i++) {
	        if (s.find(arr[i]) == s.end()) {
	            sum += arr[i];
	            s.insert(arr[i]);
	        }
	    }

	    return sum;
        
	}
};
