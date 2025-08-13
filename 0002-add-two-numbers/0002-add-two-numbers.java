// class Solution {
//     public ListNode reverse(ListNode head) {
//         ListNode curr = head;
//         ListNode pre = null;
//         while (curr != null) {
//             ListNode next = curr.next; 
//             curr.next = pre;           
//             pre = curr;                
//             curr = next;             
//         }
//         return pre; 
//     }

//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         l1 = reverse(l1);
//         l2 = reverse(l2);
        
//         ListNode dummy = new ListNode(-1);
//         ListNode current = dummy;
//         int carry = 0;
        
//         while (l1 != null || l2 != null || carry != 0) {
//             int x = (l1 != null) ? l1.val : 0;
//             int y = (l2 != null) ? l2.val : 0;
            
//             int sum = x + y + carry;
//             carry = sum / 10;
            
//             current.next = new ListNode(sum % 10);
//             current = current.next;
            
//             if (l1 != null) l1 = l1.next;
//             if (l2 != null) l2 = l2.next;
//         }
        
//         return reverse(dummy.next);
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
