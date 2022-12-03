package cn.isnap.leetcode.DataStructure.level2.day13;

import cn.isnap.leetcode.ListNode;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode stop = head;
        int i = 0;
        while (i < k && stop != null) {
            stop = stop.next;
            i++;
        }
        if (i < k) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = swap(head, stop);
        head.next = reverseKGroup(head.next, k);
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
