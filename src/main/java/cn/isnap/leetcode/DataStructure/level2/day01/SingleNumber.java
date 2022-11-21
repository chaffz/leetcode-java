package cn.isnap.leetcode.DataStructure.level2.day01;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
