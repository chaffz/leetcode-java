package cn.isnap.leetcode.algorithm.level2.day01;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {
    FindFirstAndLastPositionOfElementInSortedArray findFirstAndLast = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    public void searchRange() {
        Assert.assertArrayEquals(findFirstAndLast.searchRange(ArrayInput.asArray("[5,7,7,8,8,10]"), 8),
                ArrayInput.asArray("[3,4]"));
    }
}