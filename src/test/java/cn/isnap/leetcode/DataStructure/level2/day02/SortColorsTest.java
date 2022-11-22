package cn.isnap.leetcode.DataStructure.level2.day02;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortColorsTest {

    @Test
    public void sortColors() {
        SortColors sc = new SortColors();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        sc.sortColors(nums);
        Assert.assertArrayEquals(nums, new int[]{0, 0, 1, 1, 2, 2});

        nums = new int[]{1, 0};
        sc.sortColors(nums);
        Assert.assertArrayEquals(nums, new int[]{0, 1});
    }
}