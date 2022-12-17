package cn.isnap.leetcode.ProgrammingSkills.level1.day06;

public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int target = 0;
        for (int left = 0; left < arr.length; left++) {
            int right = arr.length - left - 1;
            target += arr[left] * (left / 2 + 1) * (right / 2 + 1);
            target += arr[left] * ((left + 1) / 2) * ((right + 1) / 2);
        }

        return target;
    }
}
