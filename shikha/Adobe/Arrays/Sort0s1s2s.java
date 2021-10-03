// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


// Example 1:

// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.

// Time complexity- O(n)

// Algorithm - The Dutch Nation Flag Problem

// Java Code👇
  
class Solution
{
    public static void sort012(int a[], int n)
    {
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(a[mid] ==0){
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;mid++;
            }else if(a[mid] ==1){
                mid++;
            }else if(a[mid] ==2){
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}
