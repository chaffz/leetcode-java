package cn.isnap.leetcode.DataStructure.level2.day19;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KeysAndRoomsTest {
    KeysAndRooms keysAndRooms = new KeysAndRooms();

    @Test
    public void canVisitAllRooms() {
        List<List<Integer>> rooms = ArrayInput.as2DList("[[1],[2],[3],[]]");
        Assert.assertTrue(keysAndRooms.canVisitAllRooms(rooms));
        Assert.assertFalse(keysAndRooms.canVisitAllRooms(ArrayInput.as2DList("[[1,3],[3,0,1],[2],[0]]")));
    }
}