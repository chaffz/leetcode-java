package cn.isnap.leetcode.lc75.level1.day04;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfTheLinkedListTest {

    @Test
    public void middleNode() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        MiddleOfTheLinkedList ml = new MiddleOfTheLinkedList();
        Assert.assertEquals(ml.middleNode(head).val, 3);
    }
}