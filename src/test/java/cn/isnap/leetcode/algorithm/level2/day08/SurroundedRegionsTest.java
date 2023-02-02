package cn.isnap.leetcode.algorithm.level2.day08;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SurroundedRegionsTest {
    SurroundedRegions surroundedRegions = new SurroundedRegions();

    @Test
    public void solve() {
        char[][] data = ArrayInput.as2DArrayChar("[[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"O\",\"X\"],[\"X\",\"X\",\"O\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]]");
        surroundedRegions.solve(data);
        char[][] compare = ArrayInput.as2DArrayChar("[[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]]");
        Assert.assertTrue(Arrays.deepEquals(data, compare));
    }
}