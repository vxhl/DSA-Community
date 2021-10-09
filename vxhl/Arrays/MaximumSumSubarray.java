/*
Problem Statement: 
Write an efficient program to find the sum of 
contiguous subarray within a one-dimensional array of numbers that has the largest sum. 

Example:
i/p -> 
[-2,-3,4,-1,-2,1,5,-3] 
o/p ->
7

Time Complexity -> Using Kadane's Algorithm we get a time complexity of O(N)
*/

package Arrays;

public class MaximumSumSubarray 
{
    static int maxSumSubarray(int[] arr)
    {
        int currSum = 0;
        int maxSum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            // We keep adding the elements
            currSum += arr[i];
            if(currSum > maxSum)
            {
                // Here we set the maxSum for as long as the number is positive
                // and we have the maximum number
                maxSum = currSum;
            }
            if(currSum<0)
            {
                // We reset if any number that is negative sets the current
                // sum as negative
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-6, 7};
        System.out.print("The Given Array is: ");
        for(int i: arr)
        {
        System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("The maximum sum subarray in the given array is: ");
        System.out.println(maxSumSubarray(arr));     
    
    }
}
