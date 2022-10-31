package cn.isnap.leetcode.lc75.level2.day14;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.length() > s.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        char[] charArrayS = s.toCharArray();
        int right = 0, left = 0, missing = t.length(), start = 0, end = 0;
        while (right < charArrayS.length) {
            if (need[charArrayS[right]] > 0)
                missing--;

            need[charArrayS[right]]--;
            right++;

            while (missing == 0) {
                if (end == 0 || (right - left) < (end - start)) {
                    end = right;
                    start = left;
                }
                need[charArrayS[left]]++;
                if (need[charArrayS[left]] > 0)
                    missing++;

                left++;
            }
        }
        return s.substring(start, end);
    }
}
