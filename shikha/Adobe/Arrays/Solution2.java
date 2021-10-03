// Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

// Example 1:

// Input:
// N = 5, K = 3
// arr[] = {1,2,3,4,5}
// Output: 3 2 1 5 4
// Explanation: First group consists of elements
// 1, 2, 3. Second group consists of 4,5.

class Solution {
    //Function to reverse every sub-array group of size k.
    static ArrayList<Integer> reverse(ArrayList<Integer>a, int start,int end){
        while(start<end){
            int temp = a.get(start);
            a.set(start,a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }return a;
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i+=k){
            if(i+k<n){
                reverse(arr,i,i+k-1);
            }else{
                reverse(arr,i,n-1);
            }
        }
    }
}
