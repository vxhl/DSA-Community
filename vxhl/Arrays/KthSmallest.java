/*
Problem Statement: 
Given an array arr[] and a number K 
where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
Example:
i/p -> 
N = 6
arr[] = 7 10 4 3 20 15
K = 3
o/p -> 
7
*/
package Arrays;
import java.util.*;
public class KthSmallest {
    static int KthSmallestElement(int arr[], int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    for(int i = 0; i<k; i++)
    {
        pq.add(arr[i]);
    }
    for(int i=k; i<arr.length;i++)
    {
        if(pq.peek()>arr[i])
        {
            pq.poll();
            pq.add(arr[i]);
        }
    }
    return pq.peek();
}
public static void main(String[] args) {
    int[] arr = {7,10,4,3,20,15};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the kth value for smallest element position: ");
    int k = sc.nextInt();
    System.out.println("The kth smallest element is: ");
    System.out.println(KthSmallestElement(arr, k));
}
}
