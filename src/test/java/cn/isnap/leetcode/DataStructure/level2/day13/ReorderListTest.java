package cn.isnap.leetcode.DataStructure.level2.day13;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderListTest {
    ReorderList reorderList = new ReorderList();

    @Test
    public void reorderList() {
        ListNode root = ArrayInput.asListNode("[1,2,3,4,5]");
        reorderList.reorderList(root);
        Assert.assertEquals(root.toString(), "1,5,2,4,3,");

        root = ArrayInput.asListNode("[1,2,3,4,5,6]");
        reorderList.reorderList(root);
        Assert.assertEquals(root.toString(), "1,6,2,5,3,4,");

        root = ArrayInput.asListNode("[1]");
        reorderList.reorderList(root);
        Assert.assertEquals(root.toString(), "1,");
    }
}