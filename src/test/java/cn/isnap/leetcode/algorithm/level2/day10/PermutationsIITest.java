package cn.isnap.leetcode.algorithm.level2.day10;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsIITest {
    PermutationsII permutationsII = new PermutationsII();

    @Test
    public void permuteUnique() {
        int[] array = ArrayInput.asArray("[1,2,3]");
        String s = permutationsII.permuteUnique(array).toString();
        Assert.assertEquals(s.replaceAll(" ", ""),
                "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]");

        array = ArrayInput.asArray("[1,1,2]");
        s = permutationsII.permuteUnique(array).toString();
        Assert.assertEquals(s.replaceAll(" ", ""),
                "[[1,1,2],[1,2,1],[2,1,1]]");
    }
}