package cn.isnap.leetcode.ProgrammingSkills.level1.day10;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListToIntegerTest {
    LinkedListToInteger linkedListToInteger = new LinkedListToInteger();

    @Test
    public void getDecimalValue() {
        ListNode root = ArrayInput.asListNode("[1,0,1]");
        Assert.assertEquals(linkedListToInteger.getDecimalValue(root), 5);
    }
}