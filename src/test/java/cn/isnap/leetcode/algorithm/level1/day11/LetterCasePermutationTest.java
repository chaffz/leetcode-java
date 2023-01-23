package cn.isnap.leetcode.algorithm.level1.day11;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LetterCasePermutationTest {
    LetterCasePermutation letterCasePermutation = new LetterCasePermutation();

    @Test
    public void letterCasePermutation() {
        Assert.assertEquals(letterCasePermutation.letterCasePermutation("a1b2"),
                Arrays.stream(ArrayInput.asStringArray("[\"a1b2\",\"a1B2\",\"A1b2\",\"A1B2\"]")).collect(Collectors.toList()));

        Assert.assertEquals(letterCasePermutation.letterCasePermutation("c"),
                Arrays.stream(ArrayInput.asStringArray("[\"c\",\"C\"]")).collect(Collectors.toList()));

    }
}