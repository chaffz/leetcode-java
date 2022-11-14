package cn.isnap.leetcode.lc75.level1.day03;

import cn.isnap.leetcode.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, cur;
        while (head != null) {
            cur = head.next;
            head.next = newHead;
            newHead = head;
            head = cur;
        }

        return newHead;
    }
}
