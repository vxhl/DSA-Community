/*
Problem Statement: 
Write a function that reverses a string.
The input string is given as an array of characters s.

Example - 
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

package Strings;

import java.util.*;

public class ReverseString {
    static void reverseString(char[] arr)
    {
        // Two pointer method
        int p1 = 0;
        int p2 = arr.length-1;
        while(p1<p2)
        {
            char temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
         
    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        System.out.println("The reversed String is: ");
        reverseString(arr);
        System.out.println(Arrays.toString(arr));

    }   
}
