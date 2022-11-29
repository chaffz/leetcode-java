package cn.isnap.leetcode.DataStructure.level2.day09;

import java.util.*;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() <= 10) return result;

        Set<String> dup = new HashSet<>();
        Map<String, Boolean> added = new HashMap<>();

        for (int i = 10; i <= s.length(); i++) {
            String sub = s.substring(i - 10, i);
            if (dup.contains(sub)) {
                if (!added.containsKey(sub)) {
                    result.add(sub);
                    added.put(sub, true);
                }
            } else {
                dup.add(sub);
            }
        }

        return result;
    }
}
