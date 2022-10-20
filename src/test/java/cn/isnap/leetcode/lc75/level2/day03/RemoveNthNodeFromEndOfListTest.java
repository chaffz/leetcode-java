package cn.isnap.leetcode.lc75.level2.day03;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() {
        ListNode head = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));

        RemoveNthNodeFromEndOfList rn = new RemoveNthNodeFromEndOfList();
        Assert.assertEquals(rn.removeNthFromEnd(head, 2).toString(), "1,2,3,5,");
        Assert.assertNull(rn.removeNthFromEnd(new ListNode(1), 1));
    }
}