// Problem Statement
// Merge two sorted arrays with O(1) extra space

package Arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace 
{
    // Method 1: O(nlogn) Approach
    // Here we first swap the elements of the array such that both have the right
    // sorted elements when merging together 
    static void MergeWESSwapandMerge(int arr1[], int arr2[])
    {
        // Here we assume that the two arrays are already sorted initially
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i=0; i<n1; i++)
        {
            // We swap if our first array has greater elements
            for(int j=0; j<n2; j++)
            {
            if(arr1[i]>arr2[j])
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            
        }
            // Now for sorting our arrays if unsorted
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }
        int[] result = new int[n1+n2];
        System.arraycopy(arr1, 0, result, 0, n1);  
        System.arraycopy(arr2, 0, result, n1, n2);  
        System.out.println(Arrays.toString(result));
    }

    // Approach 2: GAP Algorithm
    // static void MergewithGAP(int arr1[], int arr2[])
    // {
    //     int n1 = arr1.length;
    //     int n2 = arr2.length;
    //     double gap = Math.ceil((n1+n2)/2);
    //     int gap1 = (int)gap;
    //     int[] result = new int[n1+n2];
    //     System.arraycopy(arr1, 0, result, 0, n1);  
    //     System.arraycopy(arr2, 0, result, n1, n2);
    //     for(int i=0; i<result.length; i++)
    //     {
    //         if(gap1>result.length)
    //         {
    //         gap1 /= 2;
    //         }
    //         if(result[i]>result[i+gap1])
    //         {
    //             int temp = result[i];
                
    //             result[i] = result[gap1];
    //             result[gap1] = temp;
    //         }
    //         gap1++;

    //     }
    //     for(int i: result)
    //     {
    //         System.out.print(i+" ");
    //     }
    // }
    static int nextGap(int gap)
    {   // Since we need the floor value of the division we add the modulo value as well
        if(gap<=1) return 0;
        return (gap/2)+(gap%2);
    }
    static void gapalgo(int[] arr1, int[] arr2)
    {
        // First we assign the values for i,j and gap
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i, j;
        int gap = n1+n2;

        // Now we iterate for the value of gap as long as > 0
        for(gap=nextGap(gap); gap>0; gap = nextGap(gap))
        {
            // First let us compare the elements of the first array
            for(i=0; i+gap<n1; i++)
            {
                // When greater we swap
                if(arr1[i]>arr1[i+gap])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[i+gap];
                    arr1[i+gap] = temp;
                }
            }
            // Comparing elements in both arrays? 
            // What this conditional statement is saying is that basically if our gap value
            // ends up being greater than the size of the array1 then we get the difference as the value
            // of j, otherwise if it is not greater than n1 than we simply start with 0 like always
            // Why do we do this? 
            // After all the swapping operations with the first array
            for(j=gap > n1 ? gap - n1: 0; i<n1 && j<n2; i++, j++)
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }


            // We do the same for the second array 
            if(j<n2)
            {
            for(j=0; j+gap<n2; j++)
            {
                if(arr2[j]>arr2[j+gap])
                {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+gap];
                    arr2[j+gap] = temp;
                }
            }
        }
        }
        int[] result = new int[n1+n2];
        System.arraycopy(arr1, 0, result, 0, n1);  
        System.arraycopy(arr2, 0, result, n1, n2);

        for(int l: result)
        {
            System.out.print(l+" ");
        }
        
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
        int arr2[] = new int[]{2, 3, 8, 13, 11};
        int n1 = arr1.length;
        int n2 = arr2.length;
        double gap = Math.ceil((n1+n2)/2);
        int gap1 = (int)gap;
        gapalgo(arr1, arr2);

        // System.out.println(gap1);
       //  MergeWESSwapandMerge(arr1, arr2);
    }
}
