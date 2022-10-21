package cn.isnap.leetcode.lc75.level2.day04;

import cn.isnap.leetcode.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head, evenHead = new ListNode();
        ListNode even = evenHead, tail = head;

        while (odd != null && odd.next != null) {
            tail = odd;

            ListNode rm = odd.next;
            odd.next  = odd.next.next;

            rm.next = even.next;
            even.next = rm;

            even = even.next;
            odd = odd.next;
        }

        if (tail != null) {
            if (tail.next != null)
                tail = tail.next;

            tail.next = evenHead.next;
        }

        return head;
    }
}
