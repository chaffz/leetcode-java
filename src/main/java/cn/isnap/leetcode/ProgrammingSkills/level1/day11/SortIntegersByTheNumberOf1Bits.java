package cn.isnap.leetcode.ProgrammingSkills.level1.day11;

import java.util.*;
import java.util.stream.Stream;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        Stream<Integer> data = Arrays.stream(arr).map(Integer::new).boxed().sorted(new Comparator<Integer>() {
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

        return data.mapToInt(Integer::intValue).toArray();
    }
}
