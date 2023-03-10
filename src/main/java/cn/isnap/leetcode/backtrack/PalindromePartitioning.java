package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        partition(result, new LinkedList<>(), s, 0);
        return result;
    }

    private void partition(List<List<String>> result, List<String> cur, String s, int start) {
        if (cur.size() > 0 && s.length() <= start) {
            result.add(new ArrayList<>(cur));
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                cur.add(s.substring(start, i + 1));
                partition(result, cur, s, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int lo, int hi) {
        char[] chars = s.toCharArray();
        while (lo <= hi) {
            if (chars[lo] != chars[hi]) return false;
            lo++;
            hi--;
        }

        return true;
    }
}
