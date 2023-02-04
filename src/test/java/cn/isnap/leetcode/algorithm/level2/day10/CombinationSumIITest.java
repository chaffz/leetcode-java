package cn.isnap.leetcode.algorithm.level2.day10;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumIITest {
    CombinationSumII combinationSumII = new CombinationSumII();

    @Test
    public void combinationSum2() {
        List<List<Integer>> list = combinationSumII.combinationSum2(ArrayInput.asArray("[10,1,2,7,6,1,5]"), 8);
        Assert.assertEquals(list, ArrayInput.as2DList("[\n" +
                "[1,1,6],\n" +
                "[1,2,5],\n" +
                "[1,7],\n" +
                "[2,6]\n" +
                "]"));
    }
}