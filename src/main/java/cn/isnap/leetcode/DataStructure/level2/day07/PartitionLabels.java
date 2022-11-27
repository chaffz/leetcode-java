package cn.isnap.leetcode.DataStructure.level2.day07;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] labels = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            labels[chars[i] - 'a'] = i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < chars.length; i++) {
            int pos = labels[chars[i] - 'a'];
            if (pos > end) end = pos;
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }
        return result;
    }
}
