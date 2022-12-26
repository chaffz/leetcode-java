package cn.isnap.leetcode.ProgrammingSkills.level2.day03;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int over = 0, plus = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + plus + over;
            result[i + 1] = sum % 10;
            over = sum / 10;
            plus = 0;
        }

        if (over > 0) {
            result[0] = over;
        } else {
            result = Arrays.copyOfRange(result, 1, result.length);
        }

        return result;
    }
}
