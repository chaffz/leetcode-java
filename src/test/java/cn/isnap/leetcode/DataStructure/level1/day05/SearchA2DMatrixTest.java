package cn.isnap.leetcode.DataStructure.level1.day05;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SearchA2DMatrixTest {

    @Test
    public void searchMatrix() {
        String s = "[[1,3,5,7],[10,11,16,20],[23,30,34,60]]";
        int[][] matrix = JSON.parseObject(s, int[][].class);

        SearchA2DMatrix sa = new SearchA2DMatrix();
        Assert.assertTrue(sa.searchMatrix(matrix, 3));
    }
}