package cn.isnap.leetcode.lc75.level1.day04;

import cn.isnap.leetcode.ListNode;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }

        if (fast == null || fast.next == null || fast != slow) {
            return null;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
        }

        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
