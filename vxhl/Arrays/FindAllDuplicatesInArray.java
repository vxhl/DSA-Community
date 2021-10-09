/*
Problem Statement: 
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1 - 
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

*/
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray 
{
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> output_arr = new ArrayList();
        for(int i=0; i<nums.length; i++)
        {
            int index = Math.abs(nums[i]-1);
            if(nums[index]<0)
            {
                output_arr.add(index+1);}
                nums[index] = -nums[index];
            
        }
        return output_arr;
    }
}
