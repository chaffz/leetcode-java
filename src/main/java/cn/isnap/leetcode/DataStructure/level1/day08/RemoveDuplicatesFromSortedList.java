package cn.isnap.leetcode.DataStructure.level1.day08;

import cn.isnap.leetcode.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101, head);
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.next != null) {
                if (cur.next.val == cur.next.next.val) {
                    cur.next.next = cur.next.next.next;
                    continue;
                }
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
