package cn.isnap.leetcode.ProgrammingSkills.level1.day10;

import cn.isnap.leetcode.ListNode;

public class LinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result <<= 1;
            result |= head.val;
            head = head.next;
        }

        return result;
    }
}
