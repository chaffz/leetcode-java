package cn.isnap.leetcode.DataStructure.level2.day19;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.tree.ArrayTypeSignature;

import static org.junit.Assert.*;

public class FindTheTownJudgeTest {
    FindTheTownJudge townJudge = new FindTheTownJudge();

    @Test
    public void findJudge() {
        int[][] trust = ArrayInput.as2DArray("[[1,3],[2,3],[3,1]]");
        Assert.assertEquals(townJudge.findJudge(3, trust), -1);
        Assert.assertEquals(townJudge.findJudge(2, ArrayInput.as2DArray("[[1,2]]")), 2);
    }
}