package cn.isnap.leetcode.DataStructure.level1.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> line = new ArrayList<>();
            line.add(1);

            for (int j = 1; j < i - 1; j++) {
                line.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
            }

            if (i > 1) {
                line.add(1);
            }

            result.add(line);
        }
        return result;
    }
}
