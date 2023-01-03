package cn.isnap.leetcode.ProgrammingSkills.level2.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            int tmp = manager[i]; // manager
            if (tmp == -1) continue;
            if (!map.containsKey(tmp)) {
                map.put(tmp, new ArrayList<>());
            }
            map.get(tmp).add(i);
        }
        int[] max = new int[]{Integer.MIN_VALUE};
        dfs(max, headID, informTime, 0, map);
        return max[0];

    }

    private void dfs(int[] max, int id, int[] informTime, int sum, Map<Integer, List<Integer>> map) {
        // if no subordinates
        if (!map.containsKey(id)) {
            max[0] = Math.max(max[0], sum);
            return;
        }

        for (int employee : map.get(id)) {
            dfs(max, employee, informTime, sum + informTime[id], map);
        }
    }
}
