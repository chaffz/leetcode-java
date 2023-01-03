package cn.isnap.leetcode.ProgrammingSkills.level2.day11;

import java.util.*;
import java.util.stream.Stream;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> caches = new HashMap<>();
        Stream.of(strs).forEach(s -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            caches.computeIfAbsent(key, val -> new ArrayList<>()).add(s);
        });
        return new ArrayList<>(caches.values());
    }
}
