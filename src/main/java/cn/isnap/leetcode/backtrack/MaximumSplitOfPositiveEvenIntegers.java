package cn.isnap.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumSplitOfPositiveEvenIntegers {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new ArrayList<>();
        if (finalSum % 2 == 1) return result;
        Set<Long> visited = new HashSet<>();
        if (maximumEvenSplit(visited, 0, finalSum)) {
            result = new ArrayList<>(visited);
        }

        return result;
    }

    private boolean maximumEvenSplit(Set<Long> visited, long prev, long finalSum) {
        if (finalSum == 0) return true;
        for (long i = prev + 2; i <= finalSum; i += 2) {
            if (visited.contains(i)) continue;
            visited.add(i);
            if (maximumEvenSplit(visited, i, finalSum - i)) return true;
            visited.remove(i);
        }
        return false;
    }
}
