package cn.isnap.leetcode.lc75.level2.day08;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void search() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        SearchInRotatedSortedArray si = new SearchInRotatedSortedArray();
        Assert.assertEquals(si.search(nums, 0), 4);
        Assert.assertEquals(si.search(nums, 3), -1);
    }
}