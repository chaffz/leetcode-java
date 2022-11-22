package cn.isnap.leetcode.DataStructure.level2.day02;

import java.util.Arrays;

public class DesignHashMap {
    int[] map;

    public DesignHashMap() {
        int size = (int) Math.pow(10, 6) + 1;
        map = new int[size];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}
