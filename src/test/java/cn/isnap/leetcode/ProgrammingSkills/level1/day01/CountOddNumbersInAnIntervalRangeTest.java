package cn.isnap.leetcode.ProgrammingSkills.level1.day01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOddNumbersInAnIntervalRangeTest {
    CountOddNumbersInAnIntervalRange countOddNumbers = new CountOddNumbersInAnIntervalRange();

    @Test
    public void countOdds() {
        Assert.assertEquals(countOddNumbers.countOdds(3, 5), 2);
        Assert.assertEquals(countOddNumbers.countOdds(2, 4), 1);
        Assert.assertEquals(countOddNumbers.countOdds(3, 6), 2);
        Assert.assertEquals(countOddNumbers.countOdds(2, 5), 2);
    }
}