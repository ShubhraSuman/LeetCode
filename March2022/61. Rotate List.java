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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) 
            return head;
        int length = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        int rot = k % length;
        if(rot==0)
            return head;
        temp = head;
        int pass = length - rot;
        //  System.out.println("rot "+rot);
        // System.out.println("length "+length);
        // System.out.println(pass);
        while(temp!=null && pass>1)
        {
            temp = temp.next;
            pass--;
        }
        // System.out.println(temp.val);
        ListNode nextItr = temp.next;
        ListNode h1 = temp.next;
        if(temp!=null)
            temp.next = null;
        while(nextItr.next!=null&&k>1)
        {
            nextItr = nextItr.next;
            k--;
        }
        // System.out.println("nextItr.val " + nextItr.val);
        nextItr.next = head;
        head = h1;
        return head;
    }
}
// [1,2,3,4,5]
// 2
