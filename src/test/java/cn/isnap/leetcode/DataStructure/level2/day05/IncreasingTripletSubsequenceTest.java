package cn.isnap.leetcode.DataStructure.level2.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingTripletSubsequenceTest {
    static IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();

    @Test
    public void increasingTriplet() {
        int [] nums = ArrayInput.asArray("[2,1,5,0,4,6]");
        Assert.assertTrue(increasingTripletSubsequence.increasingTriplet(nums));
    }
}