package cn.isnap.leetcode.algorithm.level1.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        Set<String> result = new HashSet<>();
        char[] chars = s.toCharArray();
        char[] path = new char[chars.length];
        letterCasePermutation(result, path, chars, 0);
        return new ArrayList<>(result);
    }

    private void letterCasePermutation(Set<String> result, char[] path, char[] chars, int index) {
        if (index >= chars.length) {
            result.add(new String(path));
            return;
        }
        if (Character.isDigit(chars[index])) {
            path[index] = chars[index];
            letterCasePermutation(result, path, chars, index + 1);
            return;
        }

        path[index] = Character.toLowerCase(chars[index]);
        letterCasePermutation(result, path, chars, index + 1);
        path[index] = Character.toUpperCase(chars[index]);
        letterCasePermutation(result, path, chars, index + 1);
    }
}
