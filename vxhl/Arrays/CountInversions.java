/*
Problem Statement:
Find the inversion count in the array. 
Inversion count: 
For an array, inversion count indicates how far(or close) the array is from
being sorted. If array is already sorted then the count is 0. If the array is 
sorted in the reverse order, the inversion count is the maximum. 
Formally: 
two element arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i<j

Example: 
Input - arr[] = {2,4,1,3,5}
Output - 3 
*/

package Arrays;

import java.util.Arrays;

public class CountInversions 
{
    // Approach - MergeSort approach 
    // Whenever an element comes from the right of the merge
    // everything on the right of the pointer to the left just gets 
    // added to the count. 
    static int mergeSortandCount(int[] arr, int l, int r)
    {
        // We keep track of the inversioin count at a particular
        // node of the recurssion tree
        int count = 0;
        if(l<r)
        {
            int m = (l+r)/2;
            // Total inversion count  = left subarray count + right subarray count + Merge count

            // Left subarray count
            count+=mergeSortandCount(arr, l, m);

            // Right subarray count
            count+=mergeSortandCount(arr, m+1, r);

            // MergeCount 
            count += mergeAndCount(arr, l,m,r);
        }
        return count;
    }
    static int mergeAndCount(int[] arr, int l, int m, int r)
    {
        // Left subarray
        // .copyOfRange creates a copy of elements, within a specified range of the array
        int[] left = Arrays.copyOfRange(arr, l, m+1);
        
        // Right Subarray
        int[] right = Arrays.copyOfRange(arr, m+1, r+1);

        int i=0;
        int j =0;
        int k = l;
        int swaps = 0;

        while(i<left.length && j<right.length)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
                swaps += (m+1) - (l+i);
            }
        }
        while(i<left.length)
            arr[k++] = left[i++];
        while(j<right.length)
            arr[k++] = right[j++];
        return swaps;
    }
    public static void main(String[] args) {
        int[] arr = {1,20,6,4,5};
        System.out.println(mergeSortandCount(arr, 0, arr.length-1));
    }
}
