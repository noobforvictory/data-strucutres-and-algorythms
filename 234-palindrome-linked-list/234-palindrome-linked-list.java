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
    public ListNode reverse(ListNode head){
        ListNode prev =head;
        ListNode current = head;
        while( current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head.next = null;
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null )return false;
        if(head.next == null)return true;
        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast !=null && fast.next != null){

        prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l2 = reverse(slow);
        while(l1 != null && l2 != null){
            if(l1 == null || l2 == null)return false;
            if(l1.val != l2.val)return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}