package cn.isnap.leetcode.lc75.level2.day03;

import cn.isnap.leetcode.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = reverse(head, slow);
        if (fast != null) slow = slow.next;

        while (slow != null) {
            if (newHead.val != slow.val) return false;
            newHead = newHead.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head, ListNode stop) {
        ListNode dummy = new ListNode(0, stop);
        while (head != stop) {
            ListNode t = dummy.next;
            dummy.next = head;
            head = head.next;
            dummy.next.next = t;
        }

        return dummy.next;
    }
}
