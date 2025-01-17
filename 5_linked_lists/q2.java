class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode curr = head.next;
        ListNode prev = head;
        head.next = null;

        while(curr.next != null) {
            ListNode nxt = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nxt;
        }

        curr.next = prev;

        return curr;
    }
}