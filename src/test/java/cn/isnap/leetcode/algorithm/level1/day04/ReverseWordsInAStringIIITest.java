package cn.isnap.leetcode.algorithm.level1.day04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringIIITest {
    ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();

    @Test
    public void reverseWords() {
        Assert.assertEquals(reverseWordsInAStringIII.reverseWords("Let's take LeetCode contest"),
                "s'teL ekat edoCteeL tsetnoc");
    }
}