package cn.isnap.leetcode.lc75.level2.day03;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    @Test
    public void isPalindrome() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        PalindromeLinkedList pl = new PalindromeLinkedList();
        Assert.assertTrue(pl.isPalindrome(head));
        Assert.assertFalse(pl.isPalindrome(new ListNode(1, new ListNode(2))));
        Assert.assertTrue(pl.isPalindrome(new ListNode(1, new ListNode(0, new ListNode(1)))));
    }
}