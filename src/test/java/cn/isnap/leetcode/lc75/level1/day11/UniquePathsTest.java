package cn.isnap.leetcode.lc75.level1.day11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

    @Test
    public void uniquePaths() {
        UniquePaths up = new UniquePaths();
        Assert.assertEquals(up.uniquePaths(3, 7), 28);
        Assert.assertEquals(up.uniquePaths(3, 2), 3);
    }
}