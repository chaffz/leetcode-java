package cn.isnap.leetcode.backtrack;

import java.util.*;
import java.util.stream.Collectors;

public class NextGreaterNumericallyBalancedNumber {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static Set<Integer> numbers = new HashSet<>();
    static List<Integer> collect;
    static {
        for (int i = 1; i <= 6; i++) map.put(i, new ArrayList<>(Collections.nCopies(i, i)));
        for (int i = 1; i <= 6; i++) generate(i);
        collect = numbers.stream().sorted().collect(Collectors.toList());
        // 超过 6 位数的
        collect.add(1224444);
    }

    private static void generate(int index) {
        if (index > 6) return;
        List<Integer> array = map.get(index);
        int multi = 0;
        for (Integer num : array) {
            multi *= 10;
            multi += num;
        }
        numbers.add(multi);
        mixed(array, index - 1);
    }

    private static void mixed(List<Integer> array, int index) {
        if (index < 1) return;
        for (int i = 1; i <= index; i++) {
            List<Integer> mixed = map.get(i);
            if ((mixed.size() + array.size()) > 6) continue;
            mixed.addAll(array);
            boolean[] used = new boolean[mixed.size()];
            toNumbers(mixed, used, 0, 0);
            mixed(mixed, i - 1);
            mixed.removeAll(array);
        }
    }

    private static void toNumbers(List<Integer> array, boolean[] used, int count, int multi) {
        if (count == array.size()) {
            numbers.add(multi);
            return;
        }

        for (int i = 0; i < array.size(); i++) {
            if (used[i]) continue;
            used[i] = true;
            int newMulti = 10 * multi;
            newMulti += array.get(i);
            toNumbers(array, used, count + 1, newMulti);
            used[i] = false;
        }
    }

    public int nextBeautifulNumber(int n) {
        for (Integer num : collect) {
            if (num > n) return num;
        }
        return -1;
    }
}
