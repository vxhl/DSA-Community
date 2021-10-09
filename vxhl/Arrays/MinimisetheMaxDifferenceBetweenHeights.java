/*
Problem Statement: 
Given heights of n towers and a value k. We need to either increase or decrease the height of every tower by k (only once) where k > 0.
The task is to minimize the difference between the heights of the longest and the shortest tower after modifications and output this difference.
Example: 
Input  : arr[] = {1, 15, 10}, k = 6
Output :  Maximum difference is 5.
Explanation : We change 1 to 7, 15 to 
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.
*/
package Arrays;
import java.util.*;
public class MinimisetheMaxDifferenceBetweenHeights {
    static int MinimizeMaxDifferenceBetweenHeights(int[] arr, int key)
    {
        // First we sort the array to get the maximum and minimum element on either side of the array
        Arrays.sort(arr);
        int ans = Math.abs(arr[arr.length-1] - arr[0]);
        int smallest = arr[0]+key;
        int largest = arr[arr.length-1]-key;
        int mi=0;
        int ma=0;
        for(int i=0; i<arr.length-1; i++)
        {
            // For the minimising function we check for each of the following elements if incrementing or
            // decremeting thme yields a result that is lesser or greater than our smallest and greatest
            mi = Math.min(smallest, arr[i+1]-key);
            ma = Math.max(largest, arr[i]+key);
            // For non negative results
            if(mi<0) continue;
            // After the above steps we asign the new minimised value for our minimum ans
            ans = Math.min(ans, Math.abs(mi-ma)); 
        }
        return ans;

    } 
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int key = 5;
        System.out.println("The minimum difference between the heights is: ");
        System.out.print(MinimizeMaxDifferenceBetweenHeights(arr, key));
    }
}
