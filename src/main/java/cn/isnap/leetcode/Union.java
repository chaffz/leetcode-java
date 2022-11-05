package cn.isnap.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Union {
    private final Map<Integer, Integer> map;

    public Union() {
        map = new HashMap<>();
    }

    private int find(int v) {
        map.putIfAbsent(v, v);
        if (v != map.get(v))
            map.put(v, find(map.get(v)));
        return map.get(v);
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY)
            map.put(rootX, rootY);
    }

    public int numberOfRoots() {
        int roots = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue())) roots++;
        }
        return roots;
    }
}
