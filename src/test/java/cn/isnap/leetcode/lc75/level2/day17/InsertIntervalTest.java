package cn.isnap.leetcode.lc75.level2.day17;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertIntervalTest {

    @Test
    public void insert() {
        InsertInterval ii = new InsertInterval();
        Assert.assertTrue(Arrays.deepEquals(ii.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}), new int[][]{{1, 5}, {6, 9}}));
    }
}