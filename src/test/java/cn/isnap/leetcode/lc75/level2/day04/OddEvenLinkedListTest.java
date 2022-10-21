package cn.isnap.leetcode.lc75.level2.day04;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenLinkedListTest {

    @Test
    public void oddEvenList() {
        OddEvenLinkedList oe = new OddEvenLinkedList();
        ListNode n = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        Assert.assertEquals(oe.oddEvenList(n).toString(), "1,3,5,2,4,");

        n = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        Assert.assertEquals(oe.oddEvenList(n).toString(), "1,3,5,2,4,6,");
    }
}