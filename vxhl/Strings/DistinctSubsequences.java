/*
Problem Statement: 
Given two strings s and t, return the number of distinct subsequences of s which equals t.

A string's subsequence is a new string formed from the original string by deleting some (can be none) of the characters without disturbing
the remaining characters' relative positions. (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).

It is guaranteed the answer fits on a 32-bit signed integer.

Example - 

Input: s = "rabbbit", t = "rabbit"
Output: 3
#Dynamic Programming

*/
package Strings;

public class DistinctSubsequences 
{
    // Recurssion Approach: 
    static int DistinctSubsequences_recurssion(String s, String t, int i, int j)
    {
        if(s==t)
        {
            return 1;
        }
        if(j==t.length())
        {
            return 1;
        }
        if(i==s.length())
        {
            return 0;
        }

        if(s.charAt(i) != t.charAt(j))
        {
            return DistinctSubsequences_recurssion(s, t, i+1, j);
        }
        else
        {
            return DistinctSubsequences_recurssion(s, t, i+1,j+1) + DistinctSubsequences_recurssion(s, t, i+1, j);
        }
    }

    // Dynamic Programming Conversion
    /*
    The parameters that are changing in our recurssion, our memoisation
    table will depend on that.
    */

   
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(DistinctSubsequences_recurssion(s, t, 0,0));
    }

}