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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=null&&fast!=null)
        {
            System.out.println("Value of slow.val "+ slow.val);
            System.out.println("Value of fast.val "+ fast.val);
            int temp = fast.val;
            fast.val = slow.val;
            slow.val = temp;
            if(slow.next!=null)
            slow = slow.next.next;
            if(fast.next!=null)
            fast = fast.next.next;
        }
        return head;
    }
}
