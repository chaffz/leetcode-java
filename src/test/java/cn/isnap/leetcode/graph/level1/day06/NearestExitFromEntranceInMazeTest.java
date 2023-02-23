package cn.isnap.leetcode.graph.level1.day06;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class NearestExitFromEntranceInMazeTest {
    NearestExitFromEntranceInMaze nearestExitFromEntranceInMaze = new NearestExitFromEntranceInMaze();

    @Test
    public void nearestExit() {
        Assert.assertEquals(nearestExitFromEntranceInMaze.nearestExit(
                ArrayInput.as2DArrayChar("[['+','+','.','+'],['.','.','.','+'],['+','+','+','.']]"),
                ArrayInput.asArray("[1,2]")),
                1);
    }
}