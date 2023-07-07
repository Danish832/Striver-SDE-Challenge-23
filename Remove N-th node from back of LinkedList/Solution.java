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
        ListNode fast = head ;
        ListNode slow = head ;

        

        int i=n ; 
        while(i>0) {
            fast = fast.next ;
            i-- ;
        }
        if(fast==null) return head.next ;  
        while(fast.next!=null){
            fast =fast.next ;
            slow = slow.next ;
        }
        slow.next = slow.next.next ;

        return head ;



        // if(head.next == null){
        //     head = null ;
        //     return head ;
        // }
        // ListNode curr = head ;
        // int size = 0 ;
        // while(curr!=null){
        //     curr  = curr.next ;
        //     size++ ;
        // }
        // int last = size-n ;
        // if(last==0){
        //     head = head.next ;
        //     return head ;
        // }
        // int start = 1 ;
        // ListNode currNode = head ;
        // ListNode dNode ;
        // while(start != last){
        //     currNode = currNode.next ;
        //     start++ ;
        // }
        // dNode = currNode.next ;
        // currNode.next = dNode.next ;
        // return head ;
        
    }
}