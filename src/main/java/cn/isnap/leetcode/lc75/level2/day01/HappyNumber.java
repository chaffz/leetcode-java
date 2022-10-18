package cn.isnap.leetcode.lc75.level2.day01;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    Map<Integer, Boolean> map = new HashMap<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (map.containsKey(n))
            return false;

        map.put(n, true);

        int remain = 0;
        while (n > 0) {
            remain += Math.pow(n % 10, 2);
            n /= 10;
        }

        return isHappy(remain);
    }
}
