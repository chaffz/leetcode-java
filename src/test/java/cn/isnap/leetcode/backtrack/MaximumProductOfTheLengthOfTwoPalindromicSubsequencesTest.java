package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductOfTheLengthOfTwoPalindromicSubsequencesTest {
    MaximumProductOfTheLengthOfTwoPalindromicSubsequences subsequences = new MaximumProductOfTheLengthOfTwoPalindromicSubsequences();

    @Test
    public void maxProduct() {
//        Assert.assertEquals(subsequences.maxProduct("leetcodecom"), 9);
//        Assert.assertEquals(subsequences.maxProduct("accbcaxxcxx"), 25);
        Assert.assertEquals(subsequences.maxProduct("bb"), 1);
    }
}