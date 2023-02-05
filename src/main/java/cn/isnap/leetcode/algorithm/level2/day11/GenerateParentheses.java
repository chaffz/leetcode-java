package cn.isnap.leetcode.algorithm.level2.day11;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(result, "", n, n);
        return result;
    }

    private void generateParenthesis(List<String> result, String builder, int open, int close) {
        if (open <= 0 && close <= 0) {
            result.add(builder);
            return;
        }

        if (open > 0) generateParenthesis(result, builder + "(", open - 1, close);
        if (open < close) generateParenthesis(result, builder + ")", open, close - 1);
    }
}
