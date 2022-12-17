package cn.isnap.leetcode.ProgrammingSkills.level1.day05;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        nextGreaterElement(result, nums1, 0, nums2);
        return result;
    }

    public void nextGreaterElement(int[] result, int[] nums1, int idx1, int[] nums2) {
        if (idx1 >= nums1.length) return;

        int n = nums1[idx1];
        int r = -1;
        int i = 0;
        for (; i < nums2.length; i++) {
            if (nums2[i] == n) break;
        }
        for (; i < nums2.length; i++) {
            if (nums2[i] > n) {
                r = nums2[i];
                break;
            }
        }
        result[idx1] = r;
        nextGreaterElement(result, nums1, idx1 + 1, nums2);
    }
}
