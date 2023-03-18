package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructSmallestNumberFromDIStringTest {
    ConstructSmallestNumberFromDIString numberFromDIString = new ConstructSmallestNumberFromDIString();

    @Test
    public void smallestNumber() {
        Assert.assertEquals(numberFromDIString.smallestNumber("IIIDIDDD"), "123549876");
    }
}