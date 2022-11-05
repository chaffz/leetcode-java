package cn.isnap.leetcode.lc75.level2.day19;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfProvincesTest {

    @Test
    public void findCircleNum() {
        NumberOfProvinces np = new NumberOfProvinces();
        int count = np.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        Assert.assertEquals(count, 2);
    }
}