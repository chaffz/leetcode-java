package cn.isnap.leetcode.DataStructure.level2.day19;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> reached = new HashSet<>();
        canVisitAllRooms(reached, rooms, 0);
        for (int i = 1; i < rooms.size(); i++) {
            if (!reached.contains(i)) return false;
        }
        return true;
    }
    
    private void canVisitAllRooms(Set<Integer> reached, List<List<Integer>> rooms, int roomID) {
        List<Integer> room = rooms.get(roomID);
        boolean stop = true;
        for (Integer value : room) {
            if (reached.contains(value)) continue;
            stop = false;
            reached.add(value);
        }

        if (stop) return;

        for (Integer integer : room) {
            canVisitAllRooms(reached, rooms, integer);
        }
    }
}
