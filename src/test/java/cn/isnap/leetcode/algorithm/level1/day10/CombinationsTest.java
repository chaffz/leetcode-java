package cn.isnap.leetcode.algorithm.level1.day10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationsTest {
    Combinations combinations = new Combinations();

    @Test
    public void combine() {
        Assert.assertEquals(combinations.combine(4, 2).toString().replaceAll(" ", ""),
                "[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]");
    }
}