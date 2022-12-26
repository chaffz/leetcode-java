package cn.isnap.leetcode.ProgrammingSkills.level2.day02;

import java.util.Collections;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) return false;
        
        int end = (s.length() + 1) / 2;
        int start = 1;
        for (int i = start; i <= end; i++) {
            if (repeatedSubstringPattern(s, s.substring(0, i))) return true;
        }

        return false;
    }

    public boolean repeatedSubstringPattern(String s, String sub) {
        if ((s.length() % sub.length()) != 0) return false;
        int n = s.length() / sub.length();
        String repeated = String.join("", Collections.nCopies(n, sub));
        return repeated.equals(s);
    }
}
