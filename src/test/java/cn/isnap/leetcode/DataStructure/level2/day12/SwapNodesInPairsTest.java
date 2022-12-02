package cn.isnap.leetcode.DataStructure.level2.day12;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {
    SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    public void swapPairs() {
        ListNode node = ArrayInput.asListNode("[1,2,3,4]");
        Assert.assertEquals(swapNodesInPairs.swapPairs(node).toString(), "2,1,4,3,");

        node = ArrayInput.asListNode("[1,2,3,4,5]");
        Assert.assertEquals(swapNodesInPairs.swapPairs(node).toString(), "2,1,4,3,5,");
    }
}