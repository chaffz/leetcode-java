package cn.isnap.leetcode.ProgrammingSkills.level2.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddToArrayFormOfIntegerTest {
    AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();

    @Test
    public void addToArrayForm() {
        Assert.assertEquals(addToArrayFormOfInteger.addToArrayForm(
                ArrayInput.asArray("[1,2,0,0]"), 34).toString(), "[1, 2, 3, 4]");
    }
}