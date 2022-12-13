package cn.isnap.leetcode.ProgrammingSkills.level1.day02;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int r = 0;
        while (n != 0) {
            r++;
            n &= n - 1;
        }

        return r;
    }
}
