package cn.isnap.leetcode.DataStructure.level1.day01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        ContainsDuplicate cd = new ContainsDuplicate();
        Assert.assertTrue(cd.containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(cd.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}