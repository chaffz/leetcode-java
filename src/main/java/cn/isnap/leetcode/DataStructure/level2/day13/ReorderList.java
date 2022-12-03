package cn.isnap.leetcode.DataStructure.level2.day13;

import cn.isnap.leetcode.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode pre = new ListNode(0, head);
        while (fast != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
            fast = fast != null ? fast.next : null;
        }
        pre.next = null;
        fast = swap(slow);
        slow = head;
        merge(slow, fast);
    }

    private ListNode swap(ListNode head) {
        ListNode dummy = new ListNode(0);
        while (head != null) {
            ListNode t = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = t;
        }
        return dummy.next;
    }

    private void merge(ListNode slow, ListNode fast) {
        ListNode cur = new ListNode(0);
        ListNode l1 = slow, l2 = fast;
        while (l1 != null && l2 != null) {
            ListNode t1 = l1.next;
            ListNode t2 = l2.next;
            l2.next = cur.next;
            l1.next = l2;
            cur.next = l1;
            cur = cur.next.next;
            l1 = t1;
            l2 = t2;
        }

        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
    }
}
