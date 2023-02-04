package cn.isnap.leetcode.ProgrammingSkills.level2.day20;

import java.util.*;

public class RandomizedSet {
    Map<Integer, Integer> indexes = new HashMap<>();
    List<Integer> data = new LinkedList<>();
    Random random = new Random();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (indexes.containsKey(val)) return false;
        indexes.put(val, data.size());
        data.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (indexes.containsKey(val)) {
            int index = indexes.get(val);
            if (index < data.size()) {
                int last = data.get(data.size() - 1);
                data.set(index, last);
                indexes.put(last, index);
            }
            data.remove(data.size() - 1);
            indexes.remove(val);
            return true;
        }

        return false;
    }

    public int getRandom() {
        return data.get(random.nextInt(data.size()));
    }
}
