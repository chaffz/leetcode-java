package cn.isnap.leetcode.lc75.level2.day08;

import org.junit.Assert;
import org.junit.Test;

public class SearchA2DMatrixTest {

    @Test
    public void searchMatrix() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        SearchA2DMatrix sa = new SearchA2DMatrix();
        Assert.assertTrue(sa.searchMatrix(matrix, 3));
        Assert.assertFalse(sa.searchMatrix(matrix, 13));
    }
}