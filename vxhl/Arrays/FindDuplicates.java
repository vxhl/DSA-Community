package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicates 
{

    public int findDuplicateHashSet(int[] nums)
    {
        HashSet<Integer> dupes= new HashSet<>();
         for(int i: nums)
         {
            if(!dupes.contains(i))
            {
                dupes.add(i);
            }
            else
            {
             System.out.println("The duplicate integer is: "+ i);
            }
         }
         return 0;
    }
    static int findDuplicateFloydTortoise(int[] nums) 
    {
        // First let us declare the slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];
        while(true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast)
            {
                break;
            }

        }
        fast = nums[0];
        while(slow!=fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;    
    }
     public static void main(String[] args) {
         int[] arr = {1,3,4,2,2};
         System.out.println(findDuplicateFloydTortoise(arr));
     }   
}
