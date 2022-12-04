package cn.isnap.leetcode.DataStructure.level2.day14;

import java.util.LinkedList;
import java.util.List;

public class FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {
        List<Integer> circular = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            circular.add(i);
        }

        int cur = 0;
        while (circular.size() > 1) {
            cur += k - 1;
            cur %= circular.size();
            circular.remove(cur);
        }

        return circular.get(0);
    }
}
