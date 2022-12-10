package cn.isnap.leetcode.DataStructure.level2.day20;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopKFrequentElementsTest {
    TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    public void topKFrequent() {
        Assert.assertArrayEquals(topKFrequentElements.topKFrequent(
                ArrayInput.asArray("[1,1,1,2,2,3]"), 2
        ), ArrayInput.asArray("[1,2]"));

        // [4,1,-1,2,-1,2,3]
        Assert.assertArrayEquals(topKFrequentElements.topKFrequent(
                ArrayInput.asArray("[4,1,-1,2,-1,2,3]"), 2
        ), ArrayInput.asArray("[-1,2]"));
    }
}