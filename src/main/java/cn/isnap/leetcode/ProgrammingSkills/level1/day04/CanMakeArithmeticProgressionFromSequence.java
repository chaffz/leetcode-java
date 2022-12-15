package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            int d = arr[i] - arr[i - 1];
            if (diff != d) return false;
        }
        return true;
    }
}
