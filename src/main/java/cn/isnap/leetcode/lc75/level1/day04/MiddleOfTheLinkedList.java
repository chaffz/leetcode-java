package cn.isnap.leetcode.lc75.level1.day04;

import cn.isnap.leetcode.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
