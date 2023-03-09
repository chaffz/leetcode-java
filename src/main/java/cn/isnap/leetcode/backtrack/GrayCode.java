package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
            return new ArrayList<>(Arrays.asList(0));
        }
        // (00, 01, 11, 10) to (10, 11, 01, 00) in order to
        // generate (000, 001, 011, 010, 110, 111, 101, 100)
        List<Integer> list = grayCode(n - 1), reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        reverse = reverse.stream().map(x -> x + (1 << (n - 1))).collect(Collectors.toList());
        list.addAll(reverse);
        return list;
    }
}
