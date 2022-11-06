package cn.isnap.leetcode.lc75.level2.day20;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsTest {

    @Test
    public void permute() {
        Permutations p = new Permutations();
        Assert.assertEquals(p.permute(new int[]{1,2,3}).toString().replaceAll(" ", ""),
                "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]");
    }
}