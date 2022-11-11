package cn.isnap.leetcode.DataStructure.level1.day05;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int lo = 0;
            int hi = ints.length - 1;
            if (ints[hi] < target) continue;
            while (lo < hi) {
                if (ints[lo] == target) return true;
                if (ints[hi] == target) return true;
                int mid = lo + (hi - lo) / 2;
                if (ints[mid] == target) return true;
                else if (ints[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return false;
    }
}
