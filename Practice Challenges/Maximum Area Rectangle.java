Given N  pairs of rectangles, where each pair denotes the length L and breadth B of the ith rectangle. The task is to return the maximum area of the rectangle.

Example 1:

Input:
N = 3
rect[] = {{1,2},
          {3,4},
          {5,6}}
Output:
30

Explanation:
1. Total area of Rect. 1 = 1 * 2 = 2
2. Total area of Rect. 2 = 3 * 4 = 12
3. Total area of Rect. 3 = 5 * 6 = 30
4. Out of all rectangles, Rectangle 3 has the maximum area.

Solution:
class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
    
        int max=-99999,area=0;
        for(int i=0;i<arr.length;i++)
        {
           max=Math.max(max,arr[i].breadth * arr[i].length);
            
        }
        return max;
        
    }
    
}
