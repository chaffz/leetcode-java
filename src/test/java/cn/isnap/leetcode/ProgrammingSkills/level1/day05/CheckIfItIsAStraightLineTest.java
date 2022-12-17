package cn.isnap.leetcode.ProgrammingSkills.level1.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfItIsAStraightLineTest {
    CheckIfItIsAStraightLine isAStraightLine = new CheckIfItIsAStraightLine();

    @Test
    public void checkStraightLine() {
//        Assert.assertTrue(isAStraightLine.checkStraightLine(
//                ArrayInput.as2DArray("[[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]")));
//        Assert.assertFalse(isAStraightLine.checkStraightLine(
//                ArrayInput.as2DArray("[[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]")));
//        // [[0,0],[0,1],[0,-1]]
//        Assert.assertTrue(isAStraightLine.checkStraightLine(
//                ArrayInput.as2DArray("[[0,0],[0,1],[0,-1]]")));
        // [[0,0],[0,5],[5,5],[5,0]]
        Assert.assertFalse(isAStraightLine.checkStraightLine(
                ArrayInput.as2DArray("[[0,0],[0,5],[5,5],[5,0]]")));
    }
}