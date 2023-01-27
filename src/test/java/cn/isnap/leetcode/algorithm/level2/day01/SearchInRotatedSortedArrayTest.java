package cn.isnap.leetcode.algorithm.level2.day01;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray si = new SearchInRotatedSortedArray();

    @Test
    public void search() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        Assert.assertEquals(si.search(nums, 0), 4);
        Assert.assertEquals(si.search(nums, 3), -1);
        Assert.assertEquals(si.search(ArrayInput.asArray("[1,3,5]"), 3), 1);
        Assert.assertEquals(si.search(ArrayInput.asArray("[1,3,5]"), 1), 0);
    }
}