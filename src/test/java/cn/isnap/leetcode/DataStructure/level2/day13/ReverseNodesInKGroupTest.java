package cn.isnap.leetcode.DataStructure.level2.day13;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNodesInKGroupTest {
    ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

    @Test
    public void reverseKGroup() {
        ListNode root = ArrayInput.asListNode("[1,2,3,4,5]");
        Assert.assertEquals(reverseNodesInKGroup.reverseKGroup(root, 3).toString(), "3,2,1,4,5,");
        root = ArrayInput.asListNode("[1,2,3,4,5]");
        Assert.assertEquals(reverseNodesInKGroup.reverseKGroup(root, 2).toString(), "2,1,4,3,5,");
    }
}