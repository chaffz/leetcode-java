package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        int remain = 0;
        do {
            remain = 0;
            int r = 0;
            while (n > 0) {
                r = n % 10;
                remain = remain + (r * r);
                n = n / 10;
            }
            n = remain;
        } while (remain > 9);

        return remain == 1 || remain == 7;
    }
}
