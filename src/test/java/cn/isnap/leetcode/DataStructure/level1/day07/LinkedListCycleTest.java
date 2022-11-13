package cn.isnap.leetcode.DataStructure.level1.day07;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void hasCycle() {
        ListNode n4 = new ListNode(4);
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, n4)));
        n4.next = head.next.next;
        LinkedListCycle llc = new LinkedListCycle();
        Assert.assertTrue(llc.hasCycle(head));
    }
}