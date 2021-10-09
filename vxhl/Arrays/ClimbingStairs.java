/*
Problem Statement:
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

*/

package Arrays;

public class ClimbingStairs {
    // I recognised the pattern to be a bit like fibonacci so we can do 
    // The following using a 1D memoisation table since thhere are 
    // overlapping subrproblems as the number of stairs increase
    static int climb_stairs(int n)
    {   // We add +1 for our base case, that is 0 stairs 
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The number of ways we can climb are: ");
        System.out.println(climb_stairs(n));
    }
}
