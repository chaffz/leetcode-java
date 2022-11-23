package cn.isnap.leetcode.DataStructure.level2.day03;

import cn.isnap.leetcode.util.ArrayInput;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void rotate() {
        int[][] image = ArrayInput.as2DArray("[[1,2,3],[4,5,6],[7,8,9]]");
        RotateImage ri = new RotateImage();
        ri.rotate(image);
        /*
                    |               |
        1   2   3   |   3   2   1   |   7   4   1
        4   5   6   |   6   5   4   |   8   5   2
        7   8   9   |   9   8   7   |   9   6   3
                    |               |
                        |
        1   2   3   4   |   4   3   2   1   |
        5   6   7   8   |   8   7   6   5   |
        9   10  11  12  |   12  11  10  9   |
        13  14  15  16  |   16  15  14  13  |
                        |
        */
        Assert.assertTrue(Arrays.deepEquals(image, ArrayInput.as2DArray("[[7,4,1],[8,5,2],[9,6,3]]")));
    }
}