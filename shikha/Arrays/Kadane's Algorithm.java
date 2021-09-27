
// Kadane’s Algorithm

// The idea of Kadane’s algorithm is to maintain a maximum subarray sum ending at every index ‘i’ of the given array and update the maximum sum obtained by comparing it with the maximum sum of the subarray ending at every index ‘i’.


// At any given index ‘i’ of the array, we can either:

// Append the element at index ‘i’ to the maximum sum subarray(so just add the element at index ‘i’ to the maximum you’ve found so far).
// Start a new subarray starting from index ‘i’.
// Appending an element at index ‘i’ to the maximum sum subarray obtained so far is beneficial if the sum till index ‘i-1’ is non-negative, otherwise it is better to start a new subarray starting from index ‘i’ and update the maximum sum obtained accordingly.


public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long curSum = 0;
        long maxSum = 0;
        for(int i=0;i<n;i++){
            curSum = curSum +arr[i];
            maxSum = Math.max(curSum,maxSum);
            if(curSum<0){
                curSum = 0;
            }
        }return maxSum;
	}

}
