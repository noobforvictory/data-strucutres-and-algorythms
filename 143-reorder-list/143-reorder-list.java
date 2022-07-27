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
    public  void join(ListNode l1, ListNode l2){
         
        while(  l2!=null){
           ListNode l1_next = l1.next;
           
           ListNode l2_next = l2.next; 
            l1.next = l2;
          if(l1_next == null) break;
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
         
    }
    public  ListNode reverse(ListNode head){
      
	ListNode prevNode = head;
	ListNode currentNode = head.next;
	
	while(currentNode!=null) {
		ListNode nextNode = currentNode.next;
		currentNode.next = prevNode;
		prevNode = currentNode;
		currentNode= nextNode;
		
	}
	head.next = null;
	head = prevNode;
        return head;
    }
    public void reorderList(ListNode head) {
       if(head != null&& head.next !=null ){
       ListNode l1=head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        prev.next=null;
     ListNode l2 = reverse(slow);
        join(l1,l2);
    }}
}