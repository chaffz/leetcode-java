package cn.isnap.leetcode.lc75.level2.day04;

import cn.isnap.leetcode.ListNode;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middle = getMiddle(head);
        ListNode rest = middle.next;
        middle.next = null;

        return mergeList(sortList(head), sortList(rest));
    }

    public ListNode mergeList(ListNode left, ListNode right) {
        if (left == null && right == null) return null;
        if (left == null) return right;
        if (right == null) return left;
        if (left.val <= right.val) {
            left.next = mergeList(left.next, right);
            return left;
        } else {
            right.next = mergeList(left, right.next);
            return right;
        }
    }

    public ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
