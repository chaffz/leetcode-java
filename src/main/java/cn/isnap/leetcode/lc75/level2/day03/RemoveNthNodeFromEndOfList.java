package cn.isnap.leetcode.lc75.level2.day03;

import cn.isnap.leetcode.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            prev = prev.next;
            fast = fast.next;
        }

        prev.next = prev.next.next;
        return dummy.next;
    }
}
