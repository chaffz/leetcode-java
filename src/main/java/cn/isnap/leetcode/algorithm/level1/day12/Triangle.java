package cn.isnap.leetcode.algorithm.level1.day12;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int level = triangle.size();
        List<Integer> result = new ArrayList(triangle.get(level-1));
        for(int i = level - 2; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                result.set(j,Math.min(result.get(j),result.get(j+1)) + triangle.get(i).get(j));
        return result.get(0);
    }
}
