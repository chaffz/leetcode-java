package cn.isnap.leetcode.algorithm.level2.day20;

import java.util.*;
import java.util.stream.Collectors;

public class ShuffleAnArray {
    int[] n;

    public ShuffleAnArray(int[] nums) {
        this.n = nums;
    }

    public int[] reset() {
        return this.n;
    }

    public int[] shuffle() {
        Random rand = new Random();
        int[] t = Arrays.copyOf(n, n.length);

        for (int i = 0; i < n.length; i++) {
            int randomIndexToSwap = rand.nextInt(n.length);
            int temp = t[randomIndexToSwap];
            t[randomIndexToSwap] = t[i];
            t[i] = temp;
        }
        return t;
    }

    public int[] shuffle2() {
        List<Integer> ints = Arrays.stream(this.n).boxed().collect(Collectors.toList());
        Collections.shuffle(ints);
        return ints.stream().mapToInt(Integer::intValue).toArray();
    }
}
