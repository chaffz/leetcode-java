package cn.isnap.leetcode.DataStructure.level2.day07;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] charsPattern = pattern.toCharArray();
        char[] charsS = s.toCharArray();
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        Map<Character, String> p2s = new HashMap<>();
        Map<String, Character> s2p = new HashMap<>();
        for (char c : charsPattern) {
            if (idx >= charsS.length) return false;
            // split
            while (idx < charsS.length && charsS[idx] != ' ') {
                sb.append(charsS[idx++]);
            }
            String got = sb.toString();
            if (!p2s.containsKey(c) && !s2p.containsKey(got)) {
                p2s.put(c, got);
                s2p.put(got, c);
            } else {
                Character gc = s2p.getOrDefault(got, ' ');
                if (gc != c) return false;
                String gs = p2s.getOrDefault(c, "");
                if (!gs.equals(got)) return false;
            }

            sb.setLength(0);
            idx++;
        }

        return idx >= charsS.length;
    }
}
