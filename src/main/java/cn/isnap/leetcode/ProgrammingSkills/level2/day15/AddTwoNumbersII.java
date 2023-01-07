package cn.isnap.leetcode.ProgrammingSkills.level2.day15;

import cn.isnap.leetcode.ListNode;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversed1 = new ListNode(), reversed2 = new ListNode();
        boolean[] loop = new boolean[]{true};
        while (loop[0]) {
            loop[0] = false;
            l1 = reverse(l1, reversed1, loop);
            l2 = reverse(l2, reversed2, loop);
        }

        loop[0] = true;
        int over = 0;
        ListNode dummy = new ListNode();
        ListNode cur1 = reversed1.next, cur2 = reversed2.next;
        while (loop[0]) {
            loop[0] = false;
            if (cur1 != null) {
                over += cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                over += cur2.val;
                cur2 = cur2.next;
            }
            over = getOver(dummy, over);

            if (cur1 != null || cur2 != null || over > 0) {
                loop[0] = true;
            }
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode l1, ListNode reversed1, boolean[] loop) {
        if (l1 != null) {
            loop[0] = true;
            ListNode next = l1.next;
            l1.next = reversed1.next;
            reversed1.next = l1;
            l1 = next;
        }
        return l1;
    }

    private int getOver(ListNode dummy, int over) {
        ListNode tmp;
        tmp = dummy.next;
        dummy.next = new ListNode(over % 10);
        over /= 10;
        dummy.next.next = tmp;
        return over;
    }
}
