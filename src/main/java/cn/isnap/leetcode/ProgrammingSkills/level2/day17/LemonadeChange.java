package cn.isnap.leetcode.ProgrammingSkills.level2.day17;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
                continue;
            }
            int need = bill / 5 - 1;

            // 优先使用 10
            if (need > 1 && ten > 0) {
                need -= 2;
                ten--;
            }

            if (need > 0) {
                five -= need;
            }

            if (five < 0) return false;
            if (bill == 10) ten++;
        }

        return true;
    }
}
