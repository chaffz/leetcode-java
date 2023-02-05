package cn.isnap.leetcode.algorithm.level2.day11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCombinationsOfAPhoneNumberTest {
    LetterCombinationsOfAPhoneNumber phoneNumber = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void letterCombinations() {
        Assert.assertEquals(phoneNumber.letterCombinations("23").toString().replaceAll(" ", ""),
                "[\"ad\",\"ae\",\"af\",\"bd\",\"be\",\"bf\",\"cd\",\"ce\",\"cf\"]");
    }
}