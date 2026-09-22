/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1=head;
        ListNode ptr2;
        int i;
        ListNode prev=null;
        for(i=1;i<n;i++){
            ptr1=ptr1.next;
        }
        ptr2=head;
        while(ptr1.next!=null){
            ptr1=ptr1.next;
            prev=ptr2;
            ptr2=ptr2.next;//here exactlt ptr2---> lies in the node we want to delete
        }
        if(prev==null)//if first node to be deleted
            head=head.next;
        else
            prev.next=ptr2.next;
        return head;
          

        
        
    }
}