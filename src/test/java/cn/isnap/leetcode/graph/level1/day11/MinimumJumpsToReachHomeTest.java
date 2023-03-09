package cn.isnap.leetcode.graph.level1.day11;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumJumpsToReachHomeTest {
    MinimumJumpsToReachHome reachHome = new MinimumJumpsToReachHome();

    @Test
    public void minimumJumps() {
        Assert.assertEquals(reachHome.minimumJumps(ArrayInput.asArray("[1998]"), 1999, 2000, 2000), 3998);
        Assert.assertEquals(reachHome.minimumJumps(ArrayInput.asArray("[8,3,16,6,12,20]"), 15, 12, 11), -1);
    }
}