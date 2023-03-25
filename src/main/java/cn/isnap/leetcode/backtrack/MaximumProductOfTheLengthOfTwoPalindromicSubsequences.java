package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class MaximumProductOfTheLengthOfTwoPalindromicSubsequences {
    int max = 0;
    public int maxProduct(String s) {
        max = 0;
        maxProduct(new ArrayList<>(), new ArrayList<>(), s, 0);
        return max;
    }

    private void maxProduct(List<Integer> path1,
                            List<Integer> path2, String s, int index) {
        if (index >= s.length()) {
            if (check(path1, s) && check(path2, s))
                max = Math.max(path1.size() * path2.size(), max);
            return;
        }
        path1.add(index);
        maxProduct(path1, path2, s, index + 1);
        path1.remove(path1.size() - 1);
        path2.add(index);
        maxProduct(path1, path2, s, index + 1);
        path2.remove(path2.size() - 1);
        maxProduct(path1, path2, s, index + 1);
    }

    private boolean check(List<Integer> path, String s) {
        int lo = 0, hi = path.size() - 1;
        while (lo <= hi) {
            char c1 = s.charAt(path.get(lo));
            char c2 = s.charAt(path.get(hi));
            if (c1 != c2) return false;
            lo++;
            hi--;
        }
        return true;
    }
}
