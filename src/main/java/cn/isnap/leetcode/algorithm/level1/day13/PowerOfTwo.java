package cn.isnap.leetcode.algorithm.level1.day13;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        int r = 0;
        while (n > 0) {
            if ((++r) > 1) return false;
            n &= n - 1;
        }
        return true;
    }
}
