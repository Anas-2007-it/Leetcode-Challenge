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
    public ListNode middleNode(ListNode head) {
        ListNode ptr;
        int count=0;
        for(ptr=head;ptr!=null;ptr=ptr.next){
            count++;

        }
        int mid=(count/2)+1;
        ListNode midval;
        midval=head;
        //int i;
        for(int i=1;i<mid;i++){
            midval=midval.next;

        }
        return midval;
        
    }
}