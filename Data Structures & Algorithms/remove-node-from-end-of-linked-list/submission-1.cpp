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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp= head;
        int i=0;
        while(temp!=nullptr ){
            temp=temp->next;
            i++;
        }
        temp= head;
        int res = i - n;
        for(int j=0; j<res-1; j++){
            temp= temp->next;
        }
        if(res == 0) {
            return head->next;
        }
        temp->next = temp->next->next;
        return head;
    }
};
