package cn.isnap.leetcode.DataStructure.level2.day01;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int winner = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == winner) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                winner = nums[i];
                count = 1;
            }
        }

        return winner;
    }
}
