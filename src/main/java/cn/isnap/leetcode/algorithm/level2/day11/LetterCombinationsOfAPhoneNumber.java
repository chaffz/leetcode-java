package cn.isnap.leetcode.algorithm.level2.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    static final Map<Character, char[]> mapped = new HashMap<>();

    static {
        mapped.put('2', "abc".toCharArray());
        mapped.put('3', "def".toCharArray());
        mapped.put('4', "ghi".toCharArray());
        mapped.put('5', "jkl".toCharArray());
        mapped.put('6', "mno".toCharArray());
        mapped.put('7', "pqrs".toCharArray());
        mapped.put('8', "tuv".toCharArray());
        mapped.put('9', "wxyz".toCharArray());
    }

    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        List<String> result = new ArrayList<>();
        if (chars.length == 0) return result;

        StringBuilder builder = new StringBuilder();
        letterCombinations(result, chars, 0, builder);
        return result;
    }

    private void letterCombinations(List<String> result, char[] chars, int index, StringBuilder builder) {
        if (index >= chars.length) {
            result.add(builder.toString());
            return;
        }

        char[] next = mapped.get(chars[index]);
        for (int i = 0; i < next.length; i++) {
            builder.append(next[i]);
            letterCombinations(result, chars, index + 1, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
