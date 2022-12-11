package cn.isnap.leetcode.DataStructure.level2.day21;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KClosestPointsToOriginTest {
    KClosestPointsToOrigin closestPointsToOrigin = new KClosestPointsToOrigin();

    @Test
    public void kClosest() {
        int[][] arr = closestPointsToOrigin.kClosest(ArrayInput.as2DArray("[[1,3],[-2,2]]"), 1);
        boolean r = Arrays.deepEquals(arr, ArrayInput.as2DArray("[[-2,2]]"));
        Assert.assertTrue(r);

        arr = closestPointsToOrigin.kClosest(ArrayInput.as2DArray("[[3,3],[5,-1],[-2,4]]"), 2);
        r = Arrays.deepEquals(arr, ArrayInput.as2DArray("[[-2,4],[3,3]]"));
        Assert.assertTrue(r);
    }
}