package cn.isnap.leetcode.DataStructure.level2.day10;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addTwoNumbers() {
        Assert.assertEquals(addTwoNumbers.addTwoNumbers(
                ArrayInput.asListNode("[9,9,9,9,9,9,9]"),
                ArrayInput.asListNode("[9,9,9,9]")).toString(), "8,9,9,9,0,0,0,1,");
    }
}