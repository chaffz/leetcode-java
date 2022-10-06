package cn.isnap.leetcode.lc75.level1.day04;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleIITest {

    @Test
    public void detectCycle() {
        ListNode head = new ListNode(3, new ListNode(2));
        head.next.next = new ListNode(0, new ListNode(-4, head.next));
        LinkedListCycleII lcii = new LinkedListCycleII();
        Assert.assertEquals(lcii.detectCycle(head).val, 2);
    }
}