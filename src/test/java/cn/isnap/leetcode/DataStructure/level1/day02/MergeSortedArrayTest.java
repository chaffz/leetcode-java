package cn.isnap.leetcode.DataStructure.level1.day02;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, 3, nums2, 3);
        Assert.assertArrayEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }
}