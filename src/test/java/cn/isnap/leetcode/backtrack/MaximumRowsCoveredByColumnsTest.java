package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class MaximumRowsCoveredByColumnsTest {
    MaximumRowsCoveredByColumns maximumRowsCoveredByColumns = new MaximumRowsCoveredByColumns();

    @Test
    public void maximumRows() {
        // matrix = [[0,0,0],[1,0,1],[0,1,1],[0,0,1]], numSelect = 2
        Assert.assertEquals(maximumRowsCoveredByColumns.maximumRows(ArrayInput.as2DArray("[[0,0,0],[1,0,1],[0,1,1],[0,0,1]]"), 2), 3);
        Assert.assertEquals(maximumRowsCoveredByColumns.maximumRows(ArrayInput.as2DArray("[[1],[0]]"), 1), 2);
    }
}