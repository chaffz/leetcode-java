package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n < 9) {
            return n == 1 || n == 7;
        }

        int remain = 0;
        while (n > 0) {
            remain += Math.pow(n % 10, 2);
            n /= 10;
        }

        return isHappy(remain);
    }
}
