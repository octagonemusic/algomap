class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        if (head == null || head.next == null) {
            return false;
        }

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                return true;
            }
        }

        return false;
    }
}
