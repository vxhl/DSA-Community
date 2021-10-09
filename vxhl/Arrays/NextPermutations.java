/*
Problem Statement: 
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

Input: nums = [1,2,3]
Output: [1,3,2]

Input: nums = [1,1,5]
Output: [1,5,1]
*/
package Arrays;

import java.util.Arrays;

public class NextPermutations {
    static void swap(int[] arr, int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr,int i, int j)
    {
        while(i<j) swap(arr, i++, j--);
    }
    static void nextPermutations (int[] arr)
    {
        
        if(arr == null || arr.length <= 1) return;
        int i = arr.length - 2;
        while(i>=0 && arr[i] >= arr[i+1]) i--;
        if(i>=0)
        {
            int j = arr.length - 1;
            while(arr[j] <= arr[i]) j--;
            swap(arr, i,j);
        }
        reverse(arr, i+1, arr.length-1);
} 
public static void main(String[] args) {
    int[] arr = {1,2,3};
    nextPermutations(arr);
    System.out.println(Arrays.toString(arr));
}
}
