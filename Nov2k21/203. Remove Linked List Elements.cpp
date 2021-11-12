/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode *slPtr = head;
        ListNode *fsPtr = head;
        while(fsPtr!=NULL)
        {
            if(fsPtr->val==val)
            {
                if(fsPtr == head)
                {
                    head = head->next;
                }
                else
                {
                    slPtr->next = fsPtr->next;
                    fsPtr = slPtr;
                }
            }
            slPtr = fsPtr;
            fsPtr = fsPtr->next;
        }
        return head;
    }
};
