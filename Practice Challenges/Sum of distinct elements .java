You are given an array Arr of size N. Find the sum of distinct elements in an array.

Example 1:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So sum is 15.
  
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
