package cn.isnap.leetcode.algorithm.level2.day13;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameIITest {
    JumpGameII jumpGameII = new JumpGameII();

    @Test
    public void jump() {
        // n-1, n-1 + 1 >= n
        // n-2 = 2
        // n-3 = 1
        // n-4 = 2

        Assert.assertEquals(jumpGameII.jump(ArrayInput.asArray("[2,3,1,1,4]")), 2);
        Assert.assertEquals(jumpGameII.jump(ArrayInput.asArray("[2,3,0,1,4]")), 2);
    }
}