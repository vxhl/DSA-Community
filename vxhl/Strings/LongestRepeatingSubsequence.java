/*
Problem Statement-  Given a string, 
find the length of the longest repeating subsequence such that the two subsequences don't 
have same string character at the same position,
i.e., any i'th character in the two subsequences shouldn't have the same index in the original string.
Input: str = "aabebcde"
Output: 3
Explanation: The longest repeating subsequenece
is "abd".

looks like this is DP problem
*/

package Strings;

public class LongestRepeatingSubsequence {
    
    // We use the same thing as we do in longest common subsequence problem with an additional condition
    static int lrs(String s)
    {   
        int[][] dp = new int[s.length()+1][s.length()+1];

        for(int i=1; i<=s.length(); i++)
        {
            for(int j=1; j<=s.length(); j++)
            {
                if(s.charAt(i-1) == s.charAt(j-1) && i!=j)
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[s.length()][s.length()];
    }

    public static void main(String[] args) {
        String s = "AABEBCDD";
        System.out.println(lrs(s));
    }
}
