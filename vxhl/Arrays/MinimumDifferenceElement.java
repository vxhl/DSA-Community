/*
Problem Statement: 
Input -> arr = [1,3,8,10,15] | k = 12
Output -> 10 
Explanation: Since 12-10 = 2 is the minimum difference
*/
package Arrays;

public class MinimumDifferenceElement {
    // For this problem we implement Binary search and get the closest elements to our key value
    static int mdf(int[] arr, int key)
    {
        // Corner case for if the key is already present within the array
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                return key;
            }
        }
        // Now to find the closest elements for our key we implement binary search
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low+((high-low)/2);
            if(key == arr[mid])
            {
                System.out.println(mid);
            }
            else if(key<arr[mid])
            {
                high = mid-1; // When key is smaller than mid we take it to the left side
            }
            else
            {
                low = mid+1; // We update the low pointer to right side when our element is greater than mid
            }
        }
        if(Math.abs(arr[low]-key)>Math.abs(arr[high]-key))
        {
            return arr[high];
        }
        else
        {
            return arr[low];
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,3,8,10,15};
        int key = 12;
        System.out.println("The Minimum Difference Element: ");
        System.out.print(mdf(arr, key));
    }
}
