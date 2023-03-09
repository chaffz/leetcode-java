package cn.isnap.leetcode.graph.level1.day11;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameIIITest {
    JumpGameIII jumpGameIII = new JumpGameIII();

    @Test
    public void canReach() {
        // [4,2,3,0,3,1,2]
        Assert.assertTrue(jumpGameIII.canReach(ArrayInput.asArray("[4,2,3,0,3,1,2]"), 5));
        Assert.assertFalse(jumpGameIII.canReach(ArrayInput.asArray("[3,0,2,1,2]"), 2));
    }
}