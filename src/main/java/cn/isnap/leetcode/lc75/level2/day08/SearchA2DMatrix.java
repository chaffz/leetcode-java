package cn.isnap.leetcode.lc75.level2.day08;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            int hi = matrix[i].length - 1;
            if (matrix[i][hi] < target) continue;
            result = searchMatrix(matrix[i], target, 0, hi);
            if (result) break;
        }

        return result;
    }

    private boolean searchMatrix(int[] matrix, int target, int lo, int hi) {
        if (lo > hi) return false;

        if (matrix[lo] == target) return true;
        if (matrix[hi] == target) return true;

        int mid = lo + (hi - lo) / 2;
        if (matrix[mid] == target) return true;
        else if (matrix[mid] < target)
            return searchMatrix(matrix, target, mid + 1, hi);
        else
            return searchMatrix(matrix, target, lo, mid - 1);
    }
}
