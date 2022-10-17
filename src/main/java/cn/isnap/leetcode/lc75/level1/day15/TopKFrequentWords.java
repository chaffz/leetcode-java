package cn.isnap.leetcode.lc75.level1.day15;

import java.util.*;

public class TopKFrequentWords {
    private static class Pair {
        String word;
        Integer count;

        Pair(String w, Integer c) {
            this.word = w;
            this.count = c;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(k, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.count == o2.count)
                    return o1.word.compareTo(o2.word);
                return o2.count - o1.count;
            }
        });

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer count = map.getOrDefault(word, 0);
            count++;
            map.put(word, count);
        }

        map.forEach((word, count) -> {
            pq.offer(new Pair(word, count));
        });

        List<String> ret = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (!pq.isEmpty())
                ret.add(pq.poll().word);
            else
                break;
        }

        return ret;
    }
}
