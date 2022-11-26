package cn.isnap.leetcode.DataStructure.level2.day05;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        // left < right < (x)
        // find the x
        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= left) {
                left = num;
            } else if (num <= right) {
                right = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
