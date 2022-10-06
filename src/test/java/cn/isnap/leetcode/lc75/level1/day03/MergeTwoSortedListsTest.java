package cn.isnap.leetcode.lc75.level1.day03;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode list1 = new ListNode(1,
                new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1,
                new ListNode(3, new ListNode(4)));

        MergeTwoSortedLists mt = new MergeTwoSortedLists();
        ListNode result = mt.mergeTwoLists(list1, list2);

        Assert.assertEquals(result.toString(), "1,1,2,3,4,4,");
    }
}