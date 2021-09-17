/*
Problem Statement:
Check whether string is palindrome or not. 
Input: S = "abba"
Output: 1
*/
package Strings;

public class CheckPalindromString {

    static boolean checkPalindrom(String arr)
    {
        // Here we again use the two pointer method
        int p1 = 0;
        int p2 = arr.length()-1;
        char[] arr1 = arr.toCharArray();
        while(p1<p2)
        {
            if(arr1[p1] != arr1[p2])
            { 
                return false;
            }
            p1++;
            p2--;
            
        }
        return true;
    }
    public static void main(String[] args) {
        String arr = "MADAMM";
        System.out.print(checkPalindrom(arr));
    }
}
