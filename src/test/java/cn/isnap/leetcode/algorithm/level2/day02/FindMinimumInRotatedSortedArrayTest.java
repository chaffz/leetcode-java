package cn.isnap.leetcode.algorithm.level2.day02;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

    @Test
    public void findMin() {
        Assert.assertEquals(findMinimumInRotatedSortedArray.findMin(ArrayInput.asArray("[4,5,6,7,0,1,2]")), 0);
    }
}