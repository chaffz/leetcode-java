package cn.isnap.leetcode.lc75.level2.day19;

import org.junit.Assert;
import org.junit.Test;

public class MostStonesRemovedSameRowColumnTest {

    @Test
    public void removeStones() {
        MostStonesRemovedSameRowColumn ms = new MostStonesRemovedSameRowColumn();
        Assert.assertEquals(ms.removeStones(new int[][]{
                {0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}), 5);
    }
}