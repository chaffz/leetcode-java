package cn.isnap.leetcode.DataStructure.level2.day08;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> caches = new HashMap<>();
        for (String str : strs) {
            String encoded = encodeAnagram(str);
            List<String> cache = caches.getOrDefault(encoded, new ArrayList<>());
            cache.add(str);
            caches.put(encoded, cache);
        }

        List<List<String>> result = new ArrayList<>();
        caches.forEach((key, val) -> {
            result.add(val);
        });

        return result;
    }

    private String encodeAnagram(String in) {
        char[] chars = in.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
