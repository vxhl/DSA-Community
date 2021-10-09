// Leaders in an array
// Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 
// Example 1:

// Input:
// n = 6
// A[] = {16,17,4,3,5,2}
// Output: 17 5 2
// Explanation: The first leader is 17 
// as it is greater than all the elements
// to its right.  Similarly, the next 
// leader is 5. The right most element 
// is always a leader so it is also 
// included.

// Time Complexity-O(n)

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n){
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>=max){
                res.add(a[i]);
                max = a[i];
            }
        }Collections.reverse(res);
        return res;
    }
}
