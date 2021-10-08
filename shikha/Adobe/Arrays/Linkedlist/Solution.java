/* Given a doubly linked list of n elements. The task is to reverse the doubly linked list.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75 */

public static Node reverseDLL(Node  head)
{
    while(head!=null){
        Node next = head.next;
        head.next = head.prev;
        head.prev = next;
        if(head.prev == null){
            break;
        }head = head.prev;
    }return head;
}
