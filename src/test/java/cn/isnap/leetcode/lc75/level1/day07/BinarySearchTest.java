package cn.isnap.leetcode.lc75.level1.day07;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        BinarySearch bs = new BinarySearch();
        Assert.assertEquals(bs.search(nums, 9), 4);
    }
}