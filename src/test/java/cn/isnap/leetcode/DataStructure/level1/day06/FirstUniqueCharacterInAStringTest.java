package cn.isnap.leetcode.DataStructure.level1.day06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInAStringTest {

    @Test
    public void firstUniqChar() {
        FirstUniqueCharacterInAString fs = new FirstUniqueCharacterInAString();
        Assert.assertEquals(fs.firstUniqChar("loveleetcode"), 2);
        Assert.assertEquals(fs.firstUniqChar("aabb"), -1);
    }
}