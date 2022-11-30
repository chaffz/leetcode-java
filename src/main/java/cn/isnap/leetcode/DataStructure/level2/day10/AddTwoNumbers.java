package cn.isnap.leetcode.DataStructure.level2.day10;

import cn.isnap.leetcode.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] over = new int[]{0};
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + over[0];
            over[0] = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }

        cur = addOneListNode(l1, over, cur);
        cur = addOneListNode(l2, over, cur);

        if (over[0] > 0) {
            cur.next = new ListNode(over[0]);
        }

        return dummy.next;
    }

    private ListNode addOneListNode(ListNode l1, int[] over, ListNode cur) {
        while (l1 != null) {
            if (over[0] == 0) {
                cur.next = l1;
                break;
            }

            int sum = l1.val + over[0];
            over[0] = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);
            l1 = l1.next;
            cur = cur.next;
        }
        return cur;
    }
}
