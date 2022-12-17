package cn.isnap.leetcode.ProgrammingSkills.level1.day06;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void moveZeroes() {
        int[] nums = ArrayInput.asArray("[0,1,0,3,12]");
        moveZeroes.moveZeroes(nums);
        Assert.assertArrayEquals(nums, ArrayInput.asArray("[1,3,12,0,0]"));
    }
}