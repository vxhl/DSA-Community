package Arrays;

public class SeparatePosandNeg 
{
    // Approach 1: Partition approach
    static void SepPosNeg(int[] arr)
    {
        int j = 0; // A pointer for keeping track
        int temp;  // Swapping temporary pointer
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]<0)
            {
                if(i!=j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
                
            j++;
            }
        }
    }

    // Approch 2: Two-pointer approach
    static void SepPosNeg2(int[] arr,int left,int right)
    {
        while(left<=right)
        {
            if (arr[left] < 0 && arr[right] < 0)
            {
                left++; // For when both left and right pointers are negative
    
            }

            // When left most is positive and the other is negative
            else if(arr[left]>0 && arr[right]<0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            // When both are positive we simply traverse and increment and decremement\
            // Our left and right pointers respectively
            else
            {
                left++;
                right--;
            }
        }
    }   





    public static void main(String[] args) {
        int[] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
        
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
