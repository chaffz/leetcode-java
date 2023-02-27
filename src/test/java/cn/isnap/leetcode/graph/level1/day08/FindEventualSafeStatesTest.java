package cn.isnap.leetcode.graph.level1.day08;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindEventualSafeStatesTest {
    FindEventualSafeStates findEventualSafeStates = new FindEventualSafeStates();

    @Test
    public void eventualSafeNodes() {
        Assert.assertEquals(findEventualSafeStates.eventualSafeNodes(
                ArrayInput.as2DArray("[[1,2],[2,3],[5],[0],[5],[],[]]")).toString().replaceAll(" ", ""), "[2,4,5,6]");
    }
}