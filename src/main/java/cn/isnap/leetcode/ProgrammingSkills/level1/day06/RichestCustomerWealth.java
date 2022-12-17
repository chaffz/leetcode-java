package cn.isnap.leetcode.ProgrammingSkills.level1.day06;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }

            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
