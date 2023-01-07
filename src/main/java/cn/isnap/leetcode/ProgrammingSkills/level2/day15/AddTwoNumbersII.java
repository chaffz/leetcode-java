package cn.isnap.leetcode.ProgrammingSkills.level2.day15;

import cn.isnap.leetcode.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new LinkedList<>(), list2 = new LinkedList<>();
        while (l1 != null && l2 != null) {
            list1.add(0, l1.val);
            list2.add(0, l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            list1.add(0, l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list2.add(0, l2.val);
            l2 = l2.next;
        }

        ListNode dummy = new ListNode();
        ListNode tmp;
        int len1 = list1.size(), len2 = list2.size(), over = 0;
        int i = 0;
        for (; i < len1 && i < len2; i++) {
            over += list1.get(i);
            over += list2.get(i);
            over = getOver(dummy, over);
        }

        for (; i < len1; i++) {
            over += list1.get(i);
            over = getOver(dummy, over);
        }

        for (; i < len2; i++) {
            over += list2.get(i);
            over = getOver(dummy, over);
        }

        while (over > 0) {
            over = getOver(dummy, over);
        }

        return dummy.next;
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
