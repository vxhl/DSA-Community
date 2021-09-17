/*
Problem Statement: 
Example - 
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
*/

package Strings;
import java.util.*;

public class CountAndSay {
    
    static String countAndSay_problem(int n)
    {
         // We first handle our corner cases
         if(n<=0) return null;
        
         // Let us initialise our result string with the first value
         String result = "1";
         int i = 1; // For iteration
         while(i<n)
         {
             int count = 1; // Inorder to keep track of the consecutively repeating elements
             StringBuilder sb = new StringBuilder(); // Inorder to create our resultant string to append our values and their counts
             // We start from here in our second iteration
             for(int j = 1; j<result.length(); j++)
             {  
                 if(result.charAt(j) == result.charAt(j-1))
                 {
                     count++; // We append count as long as we have recurring elements in our array
                 }
                 else
                 {
                     // When the recurrence of the element stops we append it's count first and then append the actual element
                     sb.append(count);
                     sb.append(result.charAt(j-1));
                     count = 1; // We reset the count for the next element
                 }
             }
             // Our first iteration appends the count and value for 1 in the sb 
             sb.append(count); 
             sb.append(result.charAt(result.length()-1));
             result = sb.toString();
             i++;
         }
         
         return result;
                       
        
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.print("The required series is: ");
        System.out.println(countAndSay_problem(n));
    }

}
