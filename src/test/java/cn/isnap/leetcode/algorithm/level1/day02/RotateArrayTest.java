package cn.isnap.leetcode.algorithm.level1.day02;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    public void rotate() {
        int[] nums = ArrayInput.asArray("[1,2,3,4,5,6,7]");
        rotateArray.rotate(nums, 3);
        Assert.assertArrayEquals(nums, ArrayInput.asArray("[5,6,7,1,2,3,4]"));
    }
}