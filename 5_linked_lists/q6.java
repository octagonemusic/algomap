class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode tortoise = head;
        ListNode hare = head;

        for (int i = 0; i < n; i++) {
            hare = hare.next;
        }

        if (hare == null) {
            head = head.next;
            return head;
        }

        ListNode tortoisePrev = null;

        while (hare != null) {
            tortoisePrev = tortoise;
            tortoise = tortoise.next;
            hare = hare.next;
        }

        removeNode(tortoise, tortoisePrev);

        return head;
    }

    private void removeNode(ListNode node, ListNode prev) {
        prev.next = node.next;
    }
}