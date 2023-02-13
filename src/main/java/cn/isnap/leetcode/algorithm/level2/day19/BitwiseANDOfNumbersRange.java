package cn.isnap.leetcode.algorithm.level2.day19;

public class BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int shifts = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shifts++;
        }
        return right << shifts;
    }
}
