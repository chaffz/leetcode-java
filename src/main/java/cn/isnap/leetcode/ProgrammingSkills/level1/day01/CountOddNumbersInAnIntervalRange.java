package cn.isnap.leetcode.ProgrammingSkills.level1.day01;

public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        int result = (high - low) / 2;
        result += ((high & 1) == 1 || (low & 1) == 1) ? 1 : 0;
        return result;
    }
}
