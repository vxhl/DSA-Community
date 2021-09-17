/*
Problem Statement: 
Write an efficient program to print all the duplicates and their counts in the input string 
Input: "test string"
output: 
s, count = 2
t, count = 3
*/
package Strings;

public class PrintDuplicates {
    static final int NO_OF_CHARS = 256;
    static void fillCharCount(String str, int[] count)
    {
        for(int i=0; i<str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
    }
    static void printDuplicatesinString(String str)
    {
        int count[] = new int[NO_OF_CHARS];
        fillCharCount(str, count);
        for(int i = 0; i<NO_OF_CHARS; i++)
        {
            if(count[i]>1)
            {
                System.out.println((char)i + " - count: " + count[i]);
            }
        }
    }
    public static void main(String[] args) {
        String arr = "test string";
        printDuplicatesinString(arr);
    }
}
