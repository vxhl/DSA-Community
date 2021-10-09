/*
Problem Statement: 
Minimise/Optimise the filling of spaces on each line from the sequence
of words given in the input
*/
package Strings;

public class WordWrapProblem
{
   final int MAX = Integer.MAX_VALUE;
   
   // A utility function to print the solution
   

   /*
   l[] represents lenghts of different words in the input
   Example" l[] = {3,2,2,5} => "aaa bb cc ddddd"
   n is the size of l[]
   M is the line width ( the limit of characters to fit in a line)
   */
  static void solveWordWrap (int l[], int n, int M)
  {
      // for simplicity, 1 extra space is used in all below arrays
      
      // extras[i][j] will have a number of extra spaces if words from i to
      // j are put in a single line
      int extras[][] = new int[n+1][n+1];

      // lc[i][j] will have cost of a line which has words from
      // i to j

      int lc[][] = new int[n+1][n+1];

      // c[i] will have total cost of optimal arrangement of words
      // from 1 to i
      int c[] = new int[n+1];

      // p[] is used to prit the solution

      int p[] = new int[n+1];

      // Calculate extra spaces in a single line. The value extra[i][j]
      // indicates extra spaces if words from word number i to j are
      // placed in a single line

      for(int i = 1; i<=n; i++)
      {
          extras[i][i] = M-l[i-1];
          for(int j=i+1; j<=n; j++)
          {
              extras[i][j] = extras[i][j-1] - l[j-1] - 1;
          }
      }
      
    
  }
}