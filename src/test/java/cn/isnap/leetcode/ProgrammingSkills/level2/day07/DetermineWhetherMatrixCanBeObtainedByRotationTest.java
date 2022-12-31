package cn.isnap.leetcode.ProgrammingSkills.level2.day07;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest {
    DetermineWhetherMatrixCanBeObtainedByRotation obtainedByRotation
            = new DetermineWhetherMatrixCanBeObtainedByRotation();

    @Test
    public void findRotation() {
        Assert.assertTrue(obtainedByRotation.findRotation(
                ArrayInput.as2DArray("[[0,0,0],[0,1,0],[1,1,1]]"),
                ArrayInput.as2DArray("[[1,1,1],[0,1,0],[0,0,0]]")
        ));
    }
}