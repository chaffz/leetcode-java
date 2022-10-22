package cn.isnap.leetcode.lc75.level2.day05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeByConcatenatingTwoLetterWordsTest {

    @Test
    public void longestPalindrome() {
        String[] words = new String[]{"ab","ty","yt","lc","cl","ab"};
        LongestPalindromeByConcatenatingTwoLetterWords lp =
                new LongestPalindromeByConcatenatingTwoLetterWords();

//        Assert.assertEquals(lp.longestPalindrome(words), 8);

        Assert.assertEquals(lp.longestPalindrome(new String[]{"bb", "bb"}), 4);
    }
}