package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CanMakeArithmeticProgressionFromSequenceTest {
    CanMakeArithmeticProgressionFromSequence progressionFromSequence = new CanMakeArithmeticProgressionFromSequence();
    @Test
    public void canMakeArithmeticProgression() {
        Assert.assertTrue(progressionFromSequence.canMakeArithmeticProgression(ArrayInput.asArray("[3,5,1]")));
        Assert.assertFalse(progressionFromSequence.canMakeArithmeticProgression(ArrayInput.asArray("[1,2,4]")));
    }
}