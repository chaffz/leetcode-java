package cn.isnap.leetcode.DataStructure.level2.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > 0) break;
            findOtherTwoNumber(nums, result, i);
        }

        return result;
    }

    private void findOtherTwoNumber(int[] nums, List<List<Integer>> result, int i) {
        int j = i + 1;
        int k = nums.length - 1;

        while (j < k) {
            if (j > i + 1 && nums[j] == nums[j - 1]) {
                j++;
                continue;
            }

            if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                k--;
                continue;
            }

            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                List<Integer> ans = new ArrayList<>();
                Collections.addAll(ans, nums[i], nums[j++], nums[k--]);
                result.add(ans);
            } else if (sum > 0) {
                k--;
            } else {
                j++;
            }
        }
    }
}
