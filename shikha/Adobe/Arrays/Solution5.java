// Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output i.e you have to iterate on the original array only.

// Example 1:

// Input:
// N = 7
// Arr[] = {4, 3, 7, 8, 6, 2, 1}
// Output: 3 7 4 8 2 6 1
// Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1

// Time Complexity-O(n)

class Solution {
    void zigZag(int a[], int n) {
        boolean flip = true;
        for(int i=1;i<n;i++){
            if(flip){
                if(a[i-1]>a[i]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                }
            }else{
                if(a[i-1]<a[i]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                }
            }
            flip = !flip;
        }
    }

}
