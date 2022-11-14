package cn.isnap.leetcode.DataStructure.level1.day08;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesFromSortedList rd = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        Assert.assertEquals(rd.deleteDuplicates(head).toString(), "1,2,3,");
    }
}