package cn.isnap.leetcode.DataStructure.level2.day11;

import cn.isnap.leetcode.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode c1 = headA;
        ListNode c2 = headB;
        while (c1 != null && c2 != null) {
            c1 = c1.next;
            c2 = c2.next;
        }

        if (c1 != null) {
            c2 = headA;
            while (c1 != null) {
                c1 = c1.next;
                c2 = c2.next;
            }
            c1 = headB;
        } else {
            c1 = headB;
            while (c2 != null) {
                c1 = c1.next;
                c2 = c2.next;
            }
            c2 = headA;
        }

        while (c1 != null && c2 != null) {
            if (c1 == c2) return c1;

            c1 = c1.next;
            c2 = c2.next;
        }
        return null;
    }
}
