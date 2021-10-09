/*
Problem Statement: 
Given an array of intervals where 
intervals[i] = [starti, endi]
, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
Examples: 
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].


*/
package Arrays;
import java.util.*;

public class MergeIntervals 
{
    // Approach 1: Nick White's Approach 
    static int[][] merge_intervals(int[][] arr)
    {
        if(arr.length<=1)
        {
            return arr;
        }
        // We first sort our arrays
        // Since we want to compare our beginning value with the previous intervals last value
        Arrays.sort(arr, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        // This sorts our input on the basis of our first element
        // This sorts the array so the beginning values are sorted 

        // Since we do not know the many times we are gonna merge we are gonna
        // be using a dynamic data structure List and then when we output
        // we convert it into an array

        List<int[]> output_arr = new ArrayList();

        // StrategY: 
        int[] current_interval = arr[0];
        output_arr.add(current_interval);

        for(int[] i: arr)
        {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = i[0];  
            int next_end = i[1];

            // Now we check between the two intervals to see if the previous end value
            // is greater than that of the next begin value
            if(current_end >= next_begin)
            {
                // If it is than we change our current interval end value to the maximum value between the current and the previous interval
                current_interval[1] = Math.max(current_end, next_end);
            }
            else
            {
                current_interval = i;
                output_arr.add(current_interval);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }

    // Approach 2: Another solution with the same approach but simpler code
    static int[][] merge_intervals_striver(int[][] arr)
    {
        if(arr.length <= 1)
        {
            return arr;
        }
        Arrays.sort(arr, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        int start = arr[0][0];
        int end = arr[0][1];

        List<int[]> res = new ArrayList();
        for(int[] i: arr)
        {
            if(i[0] <= end)
            {
                end = Math.max(end, i[1]);
            }
            else
            {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
        
    }
 
public static void main(String[] args) {
    int[][]arr = {{1,3},{2,6},{8,10},{15,18}};
    System.out.println("The Array after removing the overlaps is: ");
    merge_intervals(arr);
    System.out.println(Arrays.deepToString(arr));
}
}
