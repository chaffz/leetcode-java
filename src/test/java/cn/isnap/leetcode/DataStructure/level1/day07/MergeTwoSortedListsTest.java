package cn.isnap.leetcode.DataStructure.level1.day07;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(3, new ListNode(5));
        MergeTwoSortedLists ml = new MergeTwoSortedLists();
        Assert.assertEquals(ml.mergeTwoLists(l1, l2).toString(), "1,2,3,4,5,");
    }
}