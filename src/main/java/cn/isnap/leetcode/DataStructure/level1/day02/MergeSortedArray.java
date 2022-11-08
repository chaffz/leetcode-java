package cn.isnap.leetcode.DataStructure.level1.day02;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = nums1.length - 1;
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[idx--] = nums1[i--];
            } else {
                nums1[idx--] = nums2[j--];
            }
        }

        while (i >= 0) {
            nums1[idx--] = nums1[i--];
        }

        while (j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }
}
