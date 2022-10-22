package cn.isnap.leetcode.lc75.level2.day05;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> m = new HashMap<>();
        int ret = 0;
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            int cnt = m.getOrDefault(reverse, 0);
            if (cnt > 0) {
                ret += 4;
                m.put(reverse, cnt-1);
            } else {
                m.put(word, m.getOrDefault(word, 0) + 1);
            }
        }

        for (String s : m.keySet()) {
            if (m.get(s) <= 0) continue;

            if (s.charAt(0) == s.charAt(1)) {
                ret += 2;
                break;
            }
        }

        return ret;
    }
}
