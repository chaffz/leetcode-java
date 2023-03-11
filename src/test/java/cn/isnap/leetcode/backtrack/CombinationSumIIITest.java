package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumIIITest {
    CombinationSumIII combinationSumIII = new CombinationSumIII();

    @Test
    public void combinationSum3() {
        List<List<Integer>> sum3;
        sum3 = combinationSumIII.combinationSum3(3, 7);
        Assert.assertEquals(sum3.toString().replaceAll(" ", ""), "[[1,2,4]]");

        sum3 = combinationSumIII.combinationSum3(3, 9);
        Assert.assertEquals(sum3.toString().replaceAll(" ", ""), "[[1,2,6],[1,3,5],[2,3,4]]");

        sum3 = combinationSumIII.combinationSum3(5, 3);
        Assert.assertEquals(sum3.toString().replaceAll(" ", ""), "[]");

        sum3 = combinationSumIII.combinationSum3(9, 45);
        Assert.assertEquals(sum3.toString().replaceAll(" ", ""), "[[1,2,3,4,5,6,7,8,9]]");
    }
}