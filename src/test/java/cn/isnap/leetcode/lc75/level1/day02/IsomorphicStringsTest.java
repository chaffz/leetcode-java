package cn.isnap.leetcode.lc75.level1.day02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicStringsTest {

    @Test
    public void isIsomorphic() {
        IsomorphicStrings is = new IsomorphicStrings();
        Assert.assertFalse(is.isIsomorphic("abc", "bbc"));
        Assert.assertFalse(is.isIsomorphic("foo", "bar"));
        Assert.assertFalse(is.isIsomorphic("abb", "bar"));
        Assert.assertTrue(is.isIsomorphic("abc", "edf"));
        Assert.assertTrue(is.isIsomorphic("abb", "egg"));
    }
}