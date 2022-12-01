package cn.isnap.leetcode.DataStructure.level2.day11;

import cn.isnap.leetcode.ListNode;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(Integer.MIN_VALUE, head);
        ListNode cur = dummy.next;
        ListNode pre = dummy;
        while (cur != null) {
            int val = cur.val;
            ListNode tmp = cur.next;
            boolean remove = false;
            while (tmp != null && tmp.val == val) {
                tmp = tmp.next;
                remove = true;
            }

            cur = tmp;
            if (remove) {
                pre.next = cur;
            } else {
                pre = pre.next;
            }
        }

        return dummy.next;
    }
}
