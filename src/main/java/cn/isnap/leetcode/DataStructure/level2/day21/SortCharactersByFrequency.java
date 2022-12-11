package cn.isnap.leetcode.DataStructure.level2.day21;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] counter = new int[128];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            counter[aChar]++;
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] <= o2[1] ? 1 : -1;
            }
        });
        for (int i = 0; i < counter.length; i++) {
            char c = (char) (i);
            int[] p = new int[]{c, counter[i]};
            heap.offer(p);
        }
        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            int[] p = heap.poll();
            while (p[1]-- > 0) {
                sb.append((char)p[0]);
            }
        }
        return sb.toString();
    }
}
