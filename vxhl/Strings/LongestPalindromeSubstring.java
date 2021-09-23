/*
Problem Statement: Longest Palindrome Substring
Given a string S, return the longest palindrome substring in S. 

Example 1:
------------
Input: s = "babad"
Output: "bab" 
Note: "aba" is also a valid answer.

*/

package Strings;

public class LongestPalindromeSubstring {


    static void printsubstr(String str, int low, int high)
    {
        for(int i = low; i<=high; ++i)
        {
            System.out.println(str.charAt(i));
        }
    }
    // Dynamic Programming approach
    static int palindromicSubstring(String arr)
    {
        int n = arr.length();

        int low = 0;

        // All substrings in the diagonal of the table will be palindrom

        int maxLength = 1;

        // Loop to mark the starting and ending indices
        for(int i =0; i<n; i++)
        {
            for(int j = i; j<n; j++)
            {
                int flag = 1;

                // checking for palindrom
                for(int k =0; k<(j-i+1)/2; k++)
                {
                    if(arr.charAt(i+k) != arr.charAt(j-k))
                        flag = 0;
                    
                }
                // Palindrom
                if(flag!=0 && (j-i+1) > maxLength)
                {
                    low = i;
                    maxLength = j-i+1;
                }
            }
        }
        System.out.println("Longest Paldindromic substing");
        printsubstr(arr, low, low+maxLength-1);

        return maxLength;
    }
    public static void main(String[] args) {
        String str = "babad";

        System.out.println(palindromicSubstring(str));
    }
}
