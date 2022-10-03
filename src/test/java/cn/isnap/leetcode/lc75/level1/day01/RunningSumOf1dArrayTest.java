package cn.isnap.leetcode.lc75.level1.day01;

import org.javatuples.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RunningSumOf1dArrayTest {

    @Test
    public void runningSum() {
        RunningSumOf1dArray rs = new RunningSumOf1dArray();
        Map<String, Pair<int[], int[]>> cases = new HashMap<String, Pair<int[], int[]>>();
        cases.put("case1", Pair.with(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}));
        cases.put("case2", Pair.with(new int[]{1}, new int[]{1}));
        cases.put("case3", Pair.with(new int[]{}, new int[]{}));
        cases.put("case4", Pair.with(new int[]{10, 20, 30, 40}, new int[]{10, 30, 60, 100}));
        cases.forEach((key, value) -> {
            System.out.println("begin case: " + key);
            int[] in = value.getValue0();
            int[] out = rs.runningSum(in);
            Assert.assertArrayEquals(value.getValue1(), out);
            System.out.println("end case: " + key);
        });
    }
}