package cn.isnap.leetcode.DataStructure.level1.day07;

import cn.isnap.leetcode.ListNode;

/**
 * @see cn.isnap.leetcode.lc75.level1.day03.MergeTwoSortedLists
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        if (list1 != null) cur.next = list1;
        if (list2 != null) cur.next = list2;

        return dummy.next;
    }
}
