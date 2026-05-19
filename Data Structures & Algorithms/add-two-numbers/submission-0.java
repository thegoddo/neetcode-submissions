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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode sum = new ListNode(0);
       int carry = 0;
       ListNode current = sum;

       while(l1 != null || l2 != null || carry != 0) {
        int val1 = (l1 != null) ? l1.val: 0;
        int val2 = (l2 != null) ? l2.val: 0;

        int sumVal = val1 + val2 + carry;
        carry = sumVal / 10;
        int digit = sumVal % 10;

        current.next = new ListNode(digit);
        current = current.next;

        if(l1 != null) {
            l1 = l1.next;
        }
        if(l2 != null) {
            l2 = l2.next;
        }
       }
        return sum.next;
    }
}
