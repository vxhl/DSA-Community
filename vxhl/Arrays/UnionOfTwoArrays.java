/*
Problem Statement: 
Given two unsorted arrays that represent two sets (elements in every array are distinct), find the union and intersection of two arrays.
For example, if the input arrays are: 
arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 
Output: 
Union: {1, 2, 3, 5, 6, 7, 8, 20}
Intersection: {3, 6, 7}
*/

package Arrays;

import java.util.*;
public class UnionOfTwoArrays 
{
    // Method 1: Using HashMaps
    static void printUnion(int[] A, int[] B)
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        // Insering array elements in np
        for(int i=0; i<A.length; i++)
        {
            mp.put(A[i], i);
        }   
        for(int i=0; i<B.length; i++)
        {
            mp.put(B[i], i);
        }
        System.out.println("The union set of both arrays is: ");
        for(Map.Entry mapElement : mp.entrySet())
        {
            System.out.print(mapElement.getKey()+" ");
        }

    }
    static void printIntersection(int[] A, int[] B)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i< A.length; i++)
        {
            hs.add(A[i]);
        }
        System.out.println("The Intersection between the two arrays is: ");
        for(int i=0; i<B.length; i++)
        {
            if(hs.contains(B[i]))
            {
                System.out.print(B[i]+" ");
            }
        }
    }
   public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
    int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
     
    printUnion(a,b);
    System.out.println();
    printIntersection(a, b);
    }
}
/*
Output:
The union set of both arrays is: 
1 2 3 4 5 6 8 9 
The Intersection between the two arrays is:     
2 5 6 6 5
*/