package cn.isnap.leetcode.ProgrammingSkills.level2.day11;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> caches = new ConcurrentHashMap<>();
        Arrays.stream(strs).parallel().forEach(s -> {
            encodeAnagram(caches, s);
        });

        return new ArrayList<>(caches.values());
    }

    private void encodeAnagram(Map<String, List<String>> caches, String in) {
        int[] counter = new int[26];
        char[] chars = in.toCharArray();
        for (char aChar : chars) {
            counter[aChar - 'a']++;
        }
        String key = Arrays.toString(counter);
        List<String> values = caches.getOrDefault(key, new ArrayList<>());
        values.add(in);
        caches.put(key, values);
    }
}
