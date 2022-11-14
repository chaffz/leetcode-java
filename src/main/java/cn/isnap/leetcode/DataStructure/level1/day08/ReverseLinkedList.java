package cn.isnap.leetcode.DataStructure.level1.day08;

import cn.isnap.leetcode.ListNode;

/**
 * @see cn.isnap.leetcode.lc75.level1.day03.ReverseLinkedList
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(), tmp = null;
        while (head != null) {
            tmp = dummy.next;
            dummy.next = head;
            head = head.next;
            dummy.next.next = tmp;
        }

        return dummy.next;
    }
}
