/*
Problem Statement: 
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

*/


package Arrays;

public class JumpGameI {
    public boolean canJump(int[] nums) {
        // We loop from the last element of the array, which is the destination for this given problem
        int lgip = nums.length-1;
        for(int i = nums.length-1; i>=0; i--)
        {
            if(i+nums[i]>=lgip) // While the 
            {
                lgip = i;
            }
        }
        return lgip==0;
    }
}
