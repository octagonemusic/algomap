class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode ptr1;
        ListNode ptr2;

        if (list1 == null && list2 != null) {
            return list2;
        } else if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            ptr1 = list1.next;
            ptr2 = list2;
        } else {
            head = new ListNode(list2.val);
            ptr1 = list1;
            ptr2 = list2.next;
        }

        ListNode curr = head;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                curr.next = new ListNode(ptr1.val);
                ptr1 = ptr1.next;
            } else {
                curr.next = new ListNode(ptr2.val);
                ptr2 = ptr2.next;
            }
            curr = curr.next;
        }

        if (ptr1 != null) {
            curr.next = ptr1;
        }

        if (ptr2 != null) {
            curr.next = ptr2;
        }

        return head;
    }
}