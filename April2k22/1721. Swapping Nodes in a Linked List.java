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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode st = head;
        ListNode end = head;
        int move = k;
        while(st!=null && move>1)
        {
            st = st.next;
            move--;
        }
        // System.out.println(st.val);
        int length = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            length++;
        }
        move = length-k+1;
        while(end!=null && move>1)
        {
            end = end.next;
            move--;
        }
        // System.out.println(end.val);
        int x = st.val;
        st.val = end.val;
        end.val = x;
        return head;
    }
}

