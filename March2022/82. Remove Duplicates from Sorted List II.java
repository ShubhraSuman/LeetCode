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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp==null)
            return null;
        if(temp.next==null)
            return temp;
        if(temp.val == temp.next.val)
        {
            while(head!=null && head.next!=null && (head.val == head.next.val))
              head = head.next;
            if(head.next!=null)
            head = head.next;
            else
                return null;
            
        }
        temp = head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.val == temp.next.val)
            {
                while(temp!=null&& temp.next!=null && (temp.val == temp.next.val))
                    temp = temp.next;
                if(temp.next!=null)
                {
                    head = temp.next;
                    temp = temp.next;
                }
                else
                    return null;
            }
            else if(temp.next.next!=null && (temp.next.val ==temp.next.next.val))
            {
                ListNode t1 = temp.next;
                while(t1!=null&& t1.next!=null && (t1.val == t1.next.val))
                    t1 = t1.next;
                temp.next = t1.next;
            }
            else
            temp = temp.next;            
        }
        return head;
        
    }
}
/*
[1,1,2,2,3,3,3,4,4,4,4,4,5,5,5,5]
[1,1]
[1,2,3,3,4,4,5]
*/
