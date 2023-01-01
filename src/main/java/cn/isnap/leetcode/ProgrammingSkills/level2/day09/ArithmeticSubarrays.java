package cn.isnap.leetcode.ProgrammingSkills.level2.day09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new LinkedList<>();
        for (int i = 0; i < l.length; i++) {
            result.add(checkArithmeticSubarrays(nums, l[i], r[i]));
        }
        return result;
    }

    private Boolean checkArithmeticSubarrays(int[] nums, int l, int r) {
        if (l >= r) return Boolean.TRUE;
        int[] subs = Arrays.copyOfRange(nums, l, r + 1);
        Arrays.sort(subs);
        int sub = subs[1] - subs[0];
        for (int i = 2; i < (r - l + 1); i++) {
            if ((subs[i] - subs[i - 1]) != sub) return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
