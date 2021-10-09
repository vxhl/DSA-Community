// Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.
// N = 5
// Arr[] = {3, 2, 4, 6, 5}
// Output: Yes
// Explanation: a=3, b=4, and c=5 forms a
// pythagorean triplet.

// Input:
// N = 3
// Arr[] = {3, 8, 5}
// Output: No
// Explanation: No such triplet possible.


class Solution {
    boolean checkTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) arr[i] = arr[i] * arr[i];
 
        Arrays.sort(arr);
 
        for (int i = n - 1; i >= 2; i--) {
            int l = 0; 
            int r = i - 1; 
            while (l < r) {
                if (arr[l] + arr[r] == arr[i])
                    return true;
                if (arr[l] + arr[r] < arr[i])
                    l++;
                else
                    r--;
            }
        }return false;
    }
}
