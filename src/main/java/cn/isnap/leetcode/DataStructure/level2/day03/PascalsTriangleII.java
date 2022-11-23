package cn.isnap.leetcode.DataStructure.level2.day03;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex + 1];
        arr[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            arr[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }
        return Arrays.asList(arr);
    }
}
