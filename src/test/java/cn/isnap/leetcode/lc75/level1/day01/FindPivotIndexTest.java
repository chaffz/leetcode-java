package cn.isnap.leetcode.lc75.level1.day01;

import org.javatuples.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindPivotIndexTest {

    @Test
    public void pivotIndex() {
        FindPivotIndex fpi = new FindPivotIndex();
        Map<String, Pair<int[], Integer>> cases = new HashMap<String, Pair<int[], Integer>>();
        cases.put("case1", Pair.with(new int[]{1, 2, 3, 4}, -1));
        cases.put("case2", Pair.with(new int[]{1}, 0));
        cases.put("case3", Pair.with(new int[]{}, -1));
        cases.put("case4", Pair.with(new int[]{1,7,3,6,5,6}, 3));
        cases.forEach((key, value) -> {
            System.out.println("begin case: " + key);
            int[] in = value.getValue0();
            int out = fpi.pivotIndex(in);
            Assert.assertEquals(value.getValue1().intValue(), out);
            System.out.println("end case: " + key);
        });
    }
}