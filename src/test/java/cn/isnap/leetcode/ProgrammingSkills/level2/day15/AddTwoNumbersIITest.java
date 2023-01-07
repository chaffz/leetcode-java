package cn.isnap.leetcode.ProgrammingSkills.level2.day15;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersIITest {
    AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();

    @Test
    public void addTwoNumbers() {
        // l1 = [7,2,4,3], l2 = [5,6,4]
        ListNode l1 = ArrayInput.asListNode("[7,2,4,3]");
        ListNode l2 = ArrayInput.asListNode("[5,6,4]");

        Assert.assertEquals(addTwoNumbersII.addTwoNumbers(l1, l2).toString(), "7,8,0,7,");
        Assert.assertEquals(addTwoNumbersII.addTwoNumbers(
                ArrayInput.asListNode("[5]"),
                ArrayInput.asListNode("[5]")).toString(), "1,0,");
    }
}