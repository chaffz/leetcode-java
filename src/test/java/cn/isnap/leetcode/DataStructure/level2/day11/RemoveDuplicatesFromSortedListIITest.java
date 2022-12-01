package cn.isnap.leetcode.DataStructure.level2.day11;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListIITest {
    RemoveDuplicatesFromSortedListII removeDuplicates = new RemoveDuplicatesFromSortedListII();

    @Test
    public void deleteDuplicates() {
        ListNode root = ArrayInput.asListNode("[1,2,3,3,4,4,5]");
        Assert.assertEquals(removeDuplicates.deleteDuplicates(root).toString(), "1,2,5,");

        root = ArrayInput.asListNode("[1,1,2,3,3,4,4,5]");
        Assert.assertEquals(removeDuplicates.deleteDuplicates(root).toString(), "2,5,");
    }
}