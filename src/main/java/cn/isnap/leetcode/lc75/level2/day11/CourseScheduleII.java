package cn.isnap.leetcode.lc75.level2.day11;

import java.util.*;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] before = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            before[i] = new ArrayList<>();
        }
        for (int[] p : prerequisites) {
            before[p[1]].add(p[0]);
        }

        int[] counter = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (Integer idx : before[i]) {
                counter[idx]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];
        int current = 0;
        for (int i = 0; i < numCourses; i++) {
            if (counter[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer course = queue.poll();
            result[current++] = course;
            for (Integer idx : before[course]) {
                counter[idx]--;
                if (counter[idx] == 0) {
                    queue.add(idx);
                }
            }
        }

        if (current == numCourses) return result;

        return new int[0];
    }
}
