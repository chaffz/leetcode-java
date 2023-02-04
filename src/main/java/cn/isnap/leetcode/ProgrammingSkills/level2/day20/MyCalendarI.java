package cn.isnap.leetcode.ProgrammingSkills.level2.day20;

import java.util.*;

public class MyCalendarI {
    TreeMap<Integer, Integer> map = new TreeMap();

    public MyCalendarI() {

    }

    public boolean book(int start, int end) {
        Integer smallerKey = map.floorKey(start), greaterKey = map.ceilingKey(start);

        if (smallerKey == null || map.get(smallerKey) <= start) {
            if (greaterKey == null || greaterKey >= end) {
                map.put(start, end);
                return true;
            }
        }
        return false;
    }
}
