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
      if(head==null || head.next==null)return null;
       
        ListNode cur = head;
        int i=-1;
        while(cur!=null){
            
            cur= cur.next;
            i++;
        }
        int j = i-n+1;
         if(j==0){
            return head.next;
        }
        i=0;
        cur = head;
        while(cur != null){
            i++;
            if(i==j){
                cur.next=cur.next.next;
            }
            cur=cur.next;
        }
        return head;
    }
}