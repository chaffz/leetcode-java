package cn.isnap.leetcode.ProgrammingSkills.level2.day16;

import cn.isnap.leetcode.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) return head;
        int n = 0;
        ListNode cur = head, dummy = new ListNode(), tail = dummy;
        dummy.next = head;
        while (cur != null) {
            tail = tail.next;
            cur = cur.next;
            n++;
        }
        if (n == 0) return head;
        k = n - k % n;
        if (n == k) return head;
        cur = dummy;
        while (k-- > 0) {
            cur = cur.next;
        }
        dummy.next = cur.next;
        cur.next = tail.next;
        tail.next = head;
        return dummy.next;
    }
}
