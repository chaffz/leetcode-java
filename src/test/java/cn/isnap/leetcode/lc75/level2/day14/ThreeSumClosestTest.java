package cn.isnap.leetcode.lc75.level2.day14;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        ThreeSumClosest tsc = new ThreeSumClosest();
        Assert.assertEquals(tsc.threeSumClosest(new int[]{-1, 2, 1, -4}, 1), 2);
        Assert.assertEquals(tsc.threeSumClosest(new int[]{0, 0, 0}, 1), 0);
        // [0,3,97,102,200]
        // 300
        Assert.assertEquals(tsc.threeSumClosest(new int[]{0, 3, 97, 102, 200}, 300), 300);
    }
}