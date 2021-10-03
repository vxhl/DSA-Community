/* A peak element in an array is the one that is not smaller than its neighbours.
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1) */

class Solution
{
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int low = 0;
        int high = n-1;
        while (low<=high){
          int mid = (low+high)/2;
           
          if ((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
              return mid;
          }
          else if (mid>0 && arr[mid-1]>=arr[mid]){
              high = mid-1;
          }
          
          else{
              low = mid+1;
          }
        }
  return 0;
    }
}

