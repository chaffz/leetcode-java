package cn.isnap.leetcode.lc75.level2.day18;

import org.junit.Assert;
import org.junit.Test;

public class AsteroidCollisionTest {

    @Test
    public void asteroidCollision() {
        AsteroidCollision ac = new AsteroidCollision();
        Assert.assertArrayEquals(ac.asteroidCollision(new int[]{5, 10, -5}), new int[]{5, 10});
    }
}