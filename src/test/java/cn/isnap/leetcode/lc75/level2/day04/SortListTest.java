package cn.isnap.leetcode.lc75.level2.day04;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortListTest {

    @Test
    public void sortList() {
        ListNode n = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        SortList sl = new SortList();
        Assert.assertEquals(sl.sortList(n).toString(), "1,2,3,4,");
    }
}