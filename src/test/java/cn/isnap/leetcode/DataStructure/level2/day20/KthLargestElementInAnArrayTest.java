package cn.isnap.leetcode.DataStructure.level2.day20;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestElementInAnArrayTest {
    KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();

    @Test
    public void findKthLargest() {
        Assert.assertEquals(kthLargestElementInAnArray.findKthLargest(ArrayInput.asArray("[3,2,1,5,6,4]"), 2), 5);
        Assert.assertEquals(kthLargestElementInAnArray.findKthLargest(ArrayInput.asArray("[3,2,3,1,2,4,5,5,6]"), 4), 4);
    }
}