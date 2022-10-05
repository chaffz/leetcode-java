package cn.isnap.leetcode.lc75.level1.day03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ListNode head = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedList rl = new ReverseLinkedList();
        ListNode result = rl.reverseList(head);

        Assert.assertEquals(result.toString(), "5,4,3,2,1,");
    }
}