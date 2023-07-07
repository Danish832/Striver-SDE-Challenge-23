
 // // * Definition for singly-linked list.
 //  public class Node {
 //      int val;
 //      Node next;
 //      Node() {}
 //      Node(int val) { this.val = val; }
 //      Node(int val, Node next) { this.val = val; this.next = next; }
 //  }

class Solution {
    public ListNode middleNode(ListNode head) {

        if(head==null || head.next == null){
            return head ; 
        }

        ListNode slow = head ;
        ListNode fast = head ;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next ;
            slow = slow.next ;
        }

        return slow ;


        // int getCount = 0 ;
        // ListNode currNode = head ;
        // while(currNode!=null){
        //     currNode = currNode.next ;
        //     getCount++ ;
            
        // }
        // ListNode curr = head ;
        // int start = 1 ;
        // int count = getCount/2 ;
        // while(start!=count+1){
        //     curr = curr.next ;
        //     start++ ;
        // }
        // return curr ;
    }
}