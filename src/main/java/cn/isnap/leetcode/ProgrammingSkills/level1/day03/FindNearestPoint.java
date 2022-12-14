package cn.isnap.leetcode.ProgrammingSkills.level1.day03;

public class FindNearestPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int small = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] != x && point[1] != y) continue;
            int dist = Math.abs(x - point[0]) + Math.abs(y - point[1]);
            if (dist < small) {
                small = dist;
                result = i;
            }
        }

        return result;
    }
}
