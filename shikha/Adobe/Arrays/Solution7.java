/* Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:

Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3. 
 

Example 2:

Input : arr[] = {1, 1, 1}
Output : 0 */

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            if(h.containsKey(arr[i])) h.put(arr[i], h.get(arr[i]) + 1);
            else h.put(arr[i], 1);
        }
        
        for(int i = 0; i < n; i++)
        {
            if(h.get(arr[i]) == 1)
            return arr[i];
        }
        
        return 0;
    }  
    
}
