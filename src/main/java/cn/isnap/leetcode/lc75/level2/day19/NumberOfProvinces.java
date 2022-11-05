package cn.isnap.leetcode.lc75.level2.day19;

import cn.isnap.leetcode.Union;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        Union uf = new Union();
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }

        return uf.numberOfRoots();
    }
}
