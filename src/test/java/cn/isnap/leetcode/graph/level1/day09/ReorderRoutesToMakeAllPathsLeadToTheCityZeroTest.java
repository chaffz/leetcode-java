package cn.isnap.leetcode.graph.level1.day09;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
    ReorderRoutesToMakeAllPathsLeadToTheCityZero leadToTheCityZero = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

    @Test
    public void minReorder() {
        Assert.assertEquals(leadToTheCityZero.minReorder(6,
                ArrayInput.as2DArray("[[0,1],[1,3],[2,3],[4,0],[4,5]]")), 3);
    }
}