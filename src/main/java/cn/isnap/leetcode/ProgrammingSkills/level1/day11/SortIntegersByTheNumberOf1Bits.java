package cn.isnap.leetcode.ProgrammingSkills.level1.day11;

import java.util.*;
import java.util.stream.Collectors;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        List<Integer> data = Arrays.stream(arr).map(Integer::new).boxed().collect(Collectors.toList());
        data.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int bit1 = Integer.bitCount(o1);
                int bit2 = Integer.bitCount(o2);
                if (bit1 > bit2) return 1;
                else if (bit1 == bit2) {
                    if (o1 > o2) return 1;
                }
                return -1;
            }
        });

        return data.stream().mapToInt(Integer::intValue).toArray();
    }
}
