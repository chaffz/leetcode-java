package cn.isnap.leetcode.algorithm.level2.day09;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsIITest {
    SubsetsII subsetsII = new SubsetsII();

    @Test
    public void subsetsWithDup() {
        Assert.assertEquals(subsetsII.subsetsWithDup(ArrayInput.asArray("[1,2,2]")).toString().replaceAll(" ", ""),
                "[[],[1],[1,2],[1,2,2],[2],[2,2]]");
    }
}