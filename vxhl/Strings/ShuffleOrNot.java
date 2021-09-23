/*
Problem Statement:
Check whether the given string is a valid shuffle of two strings or not

Example:
s1 = xy
s2 = 12
res = x1y2
output: Yes

*/
package Strings;

public class ShuffleOrNot {
    
    static boolean isValidShuffle(String s1 , String s2, String res)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        int lr = res.length();
        
        // Since our resultant string has to be the same lenght, we return false if it is not
        if((l1+l2)!=lr) return false;

        else
        {
            int f = 0; // flagging pointer
            int i= 0; // i for s1, j for s2, k for res
            int j = 0;
            int k = 0;
            while(k<lr) // k is smaller than length of the resultant string
            {
                if(i<l1 && s1.charAt(i)==res.charAt(k))  i++;
                else if(j<l2 && s2.charAt(j)==res.charAt(k)) j++;
                else // If the element from res is not in s1 and s2
                {
                    f = 1;
                    break;
                }
                k++; 
            }
            // If either of the two pointers never reached the end than our shuffle is false
            if(i<l1 || j<l2) return false;
            else return true;
        }

    }
    public static void main(String[] args) {
        String s1 = "xy";
        String s2 = "123";
        String res = "x1y2344"; // False string
        String res1 = "x1y23"; // True String 
        System.out.println(isValidShuffle(s1, s2, res));
    }
    
}

/*
Takeaways: 
The String problems I have done till now have all done a great job in making the concepts of pointers very clear.
How to use multiple pointers to traverse multiple strings and comprare them is pretty much clear to me, all that's left is to 
revise them or do more problems myself without any help.

*/