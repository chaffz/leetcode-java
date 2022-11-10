package cn.isnap.leetcode.DataStructure.level1.day04;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReshapeTheMatrixTest {

    @Test
    public void matrixReshape() {
        ReshapeTheMatrix rtm = new ReshapeTheMatrix();
        Assert.assertEquals(Arrays.deepToString(rtm.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 2)), "[[1, 2], [3, 4]]");
        Assert.assertEquals(Arrays.deepToString(rtm.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4)), "[[1, 2], [3, 4]]");

        /**
         * [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16],[17,18,19,20]]
         * 42
         * 5
         */
        int[][] mat = JSON.parseObject("[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16],[17,18,19,20]]", int[][].class);
        Assert.assertEquals(Arrays.deepToString(rtm.matrixReshape(mat, 42, 5)),
                "[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16], [17, 18, 19, 20]]");
    }
}