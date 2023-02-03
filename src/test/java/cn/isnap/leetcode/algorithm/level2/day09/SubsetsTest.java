package cn.isnap.leetcode.algorithm.level2.day09;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsTest {
    Subsets subsets = new Subsets();

    @Test
    public void subsets() {
        Assert.assertEquals(subsets.subsets(ArrayInput.asArray("[1,2,3]")).toString().replaceAll(" ", ""),
                "[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]");
    }
}