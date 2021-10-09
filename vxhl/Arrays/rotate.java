package Arrays;

import java.util.Arrays;

public class rotate {

    static void rotateArray(int[] arr)
    {
        int x = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int i=0;
        int j = arr.length-1;
        while(i!=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The Rotated Array is: ");
        rotateArray(arr1);
        System.out.println(Arrays.toString(arr1));
        

    }
}
