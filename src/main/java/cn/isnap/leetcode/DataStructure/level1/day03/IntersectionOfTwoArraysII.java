package cn.isnap.leetcode.DataStructure.level1.day03;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] counter = new int[1001];
        for (int num : nums1) {
            counter[num]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (counter[num] > 0) {
                result.add(num);
                counter[num]--;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
