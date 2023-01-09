package cn.isnap.leetcode.ProgrammingSkills.level2.day16;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateListTest {
    RotateList rotateList = new RotateList();

    @Test
    public void rotateRight() {
        ListNode head = ArrayInput.asListNode("[1,2,3,4,5]");
//        Assert.assertEquals(rotateList.rotateRight(head, 2).toString(), "4,5,1,2,3,");
//        head = ArrayInput.asListNode("[0,1,2]");
//        Assert.assertEquals(rotateList.rotateRight(head, 4).toString(), "2,0,1,");
        head = ArrayInput.asListNode("[1]");
        Assert.assertEquals(rotateList.rotateRight(head, 1).toString(), "1,");
        Assert.assertEquals(rotateList.rotateRight(head, 0).toString(), "1,");
        Assert.assertEquals(rotateList.rotateRight(head, 99).toString(), "1,");
        head = ArrayInput.asListNode("[1,2]");
        Assert.assertEquals(rotateList.rotateRight(head, 0).toString(), "1,2,");
    }
}