/*
Problem Statement:
Find the min and max elements in an array using the minimum number of comparisons
Example: 

*/
package Arrays;

public class MinMax {
    
    static class Pair
    {
        int min;
        int max;
    }
    static Pair minMax(int[] arr)
    {
        Pair minmax = new Pair();
        if(arr[0]>arr[1])
        {
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        else
        {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        for(int i=2; i<arr.length; i++)
        {
            if(arr[i]>minmax.max)
            {
                minmax.max = arr[i];
            }
            if(arr[i]<minmax.min)
            {
                minmax.min = arr[i]; 
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6346346,-92592359};
        Pair minmax = minMax(arr);
        System.out.println(minmax.max);
        System.out.println(minmax.min);
    }
}
