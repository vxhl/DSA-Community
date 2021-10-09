// Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
// Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

// Example 1:

// Input: 
// n = 5 
// A[] = {1,3,5,2,2} 
// Output: 3 
// Explanation: For second test case 
// equilibrium point is at position 3 
// as elements before it (1+3) = 
// elements after it (2+2).

// Time Complexity - O(n)

  class Solution {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long suml = 0, sumr = 0;
        int start = 0, end = n-1, flag = 0;
        while(start<=end){
            if(suml == sumr &&  flag == 1 && end == start)
                return end+1;
            else if(suml<sumr){
                suml += arr[start++];
            }
            else{
                sumr += arr[end--];
            }
            flag = 1;
        }
        return n == 1 ? 1 : -1;
    }
    
}
