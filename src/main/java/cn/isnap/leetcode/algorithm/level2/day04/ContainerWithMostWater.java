package cn.isnap.leetcode.algorithm.level2.day04;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int lo = 0, hi = height.length - 1;
        while (lo < hi) {
            int x = hi - lo, area;
            int y1 = height[lo], y2 = height[hi];
            if (y1 > y2) {
                area = x * y2;
                hi--;
            } else {
                area = x * y1;
                lo++;
            }

            max = Math.max(max, area);
        }
        return max;
    }
}
