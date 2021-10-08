/* Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
Example 2:

Input:
N = 4
value[] = {1,2,3,4}
Output: 0
Explanation: The given linked list
is 1 2 3 4 , which is not a palindrome
and Hence, the output is 0. */

class Solution
{
    //Function to check whether the list is palindrome.
    
    Node findMid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur!=null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }return prev;
    }
    
    boolean isPalindrome(Node head) 
    {
        if(head==null)return true;
        Node mid = findMid(head);
        Node newNode = reverse(mid.next);
        Node temp1 = head;
        Node temp2 = newNode;
        while(temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }temp1 = temp1.next;
            temp2 = temp2.next;
        }return true;
    }  
}

