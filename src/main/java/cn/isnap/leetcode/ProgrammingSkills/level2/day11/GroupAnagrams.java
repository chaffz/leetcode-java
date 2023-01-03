package cn.isnap.leetcode.ProgrammingSkills.level2.day11;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> caches = new HashMap<>();
        for (String str : strs) {
            encodeAnagram(caches, str);
        }
        return new ArrayList<>(caches.values());
    }

    private void encodeAnagram(Map<String, List<String>> caches, String in) {
        char[] chars = in.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        caches.putIfAbsent(key, new ArrayList<>());
        caches.get(key).add(in);
    }
}
