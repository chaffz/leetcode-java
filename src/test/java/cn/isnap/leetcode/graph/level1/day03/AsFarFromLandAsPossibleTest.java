package cn.isnap.leetcode.graph.level1.day03;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsFarFromLandAsPossibleTest {
    AsFarFromLandAsPossible asFarFromLandAsPossible = new AsFarFromLandAsPossible();

    @Test
    public void maxDistance() {
        Assert.assertEquals(asFarFromLandAsPossible.maxDistance(
                ArrayInput.as2DArray("[[1,0,1],[0,0,0],[1,0,1]]")), 2);
    }
}