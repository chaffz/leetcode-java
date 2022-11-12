package cn.isnap.leetcode.DataStructure.level1.day06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram", t = "nagaram";
        Assert.assertTrue(va.isAnagram(s, t));

        s = "rat";
        t = "car";
        Assert.assertFalse(va.isAnagram(s, t));
    }
}