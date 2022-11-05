package cn.isnap.leetcode.lc75.level2.day19;

import cn.isnap.leetcode.Union;

public class MostStonesRemovedSameRowColumn {
    public int removeStones(int[][] stones) {
        Union un = new Union();
        for(int[] stone: stones)
            un.union(stone[0], ~stone[1]);
        return stones.length - un.numberOfRoots();
    }
}
