package cn.isnap.leetcode.DataStructure.level2.day12;

import cn.isnap.leetcode.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = swap(head, head.next.next);
        head.next = swapPairs(head.next);
        return dummy.next;
    }

    private ListNode swap(ListNode head, ListNode stop) {
        ListNode dummy = new ListNode(0, stop);
        while (head != stop) {
            ListNode t = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = t;
        }
        return dummy.next;
    }
}
