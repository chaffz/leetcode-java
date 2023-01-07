package cn.isnap.leetcode.ProgrammingSkills.level2.day15;

import cn.isnap.leetcode.ListNode;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversed1 = new ListNode(), reversed2 = new ListNode();
        while (l1 != null || l2 != null) {
            l1 = reverse(l1, reversed1);
            l2 = reverse(l2, reversed2);
        }

        ListNode dummy = new ListNode();
        boolean loop = true;
        int over = 0;
        ListNode cur1 = reversed1.next, cur2 = reversed2.next;
        while (cur1 != null || cur2 != null || over > 0) {
            if (cur1 != null) {
                over += cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                over += cur2.val;
                cur2 = cur2.next;
            }
            over = getOver(dummy, over);
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode l1, ListNode reversed1) {
        if (l1 != null) {
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
