package cn.isnap.leetcode.lc75.level1.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    @Test
    public void numIslands() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        NumberOfIslands nis = new NumberOfIslands();
        Assert.assertEquals(nis.numIslands(grid), 1);
    }
}