/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;
};
*/

class Solution {
public:
    Node* flatten(Node* head) {
        Node *tmp = head,*tmpNext,*runner;
        while(tmp!=NULL)
        {
            if(tmp->child)
            {
                tmpNext = tmp->next;
                tmp->next = tmp->child;
                tmp->next->prev = tmp;
                tmp->child = NULL;
                
                // Run till the end of the current list and connect last node to saved next
                runner = tmp->next;
                while (runner->next) runner = runner->next;
                runner->next = tmpNext;
                if (runner->next) runner->next->prev = runner;
                
                
            }
            tmp = tmp->next;
        }
        return head;
    }
};
