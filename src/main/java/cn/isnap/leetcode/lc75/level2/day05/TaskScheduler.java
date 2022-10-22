package cn.isnap.leetcode.lc75.level2.day05;

import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] counter = new int[26];
        int max = 0, same = 0;
        for (char task : tasks) {
            int c = ++counter[task - 'A'];
            if (max < c) max = c;
        }

        for (int i = 0; i < 26; i++) {
            if (counter[i] == max) same++;
        }

        int prefix = same;
        int bLen = n + 1;
        int bNum = max - 1;

        return Math.max(bLen * bNum + prefix, tasks.length);
    }
}
