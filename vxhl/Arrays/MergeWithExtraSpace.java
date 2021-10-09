package Arrays;

public class MergeWithExtraSpace 
{
    static void MergeArraysExtraSpace(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int i = 0, j=0, k=0;

        // let us traverse beoth the arrays
        while(i<n1 && j<n2)
        {
            // We check if the current element of the first
            // array is smaller than that of the second array, if yes we store
            // the array element in arr3 and incremement first array index 
            // as well as arr3 index
            if(arr1[i] < arr2[j])
            {
                arr3[k++] = arr1[i++];
            }
            else
            {
                arr3[k++] = arr2[j++];
            }
        }
        
        // Than we copy over the remaining element of the first and second arrays
        while(i<n1)
        {
            arr3[k++] = arr1[i++];
        }
        while(j<n2)
        {
            arr3[k++] = arr2[j++];
        }
        for(int l: arr3)
        {
            System.out.print(l+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
        System.out.print("The Arrays after merging: ");
        MergeArraysExtraSpace(arr1, arr2);
    }
}
