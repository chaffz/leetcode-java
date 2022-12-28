package cn.isnap.leetcode.ProgrammingSkills.level2.day05;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new LinkedList<>();
        int i = num.length - 1;
        int over = 0;
        while (i >= 0 || k > 0 || over > 0) {
            int sum = over;
            if (i >= 0) {
                sum += num[i--];
            }
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            result.add(0, sum % 10);
            over = sum / 10;
        }

        return result;
    }
}
