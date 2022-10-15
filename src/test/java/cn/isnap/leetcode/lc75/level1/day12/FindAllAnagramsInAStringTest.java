package cn.isnap.leetcode.lc75.level1.day12;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FindAllAnagramsInAStringTest {

    @Test
    public void findAnagrams() {
        FindAllAnagramsInAString fa = new FindAllAnagramsInAString();
        List<Integer> r = fa.findAnagrams("cbaebabacd", "abc");
        Assert.assertEquals(r.toArray(new Integer[r.size()]), new Integer[]{0, 6});

        r = fa.findAnagrams("abab", "ab");
        Assert.assertEquals(r.toArray(new Integer[r.size()]), new Integer[]{0, 1, 2});

        r = fa.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa");
        Assert.assertEquals(r.toArray(new Integer[r.size()]), new Integer[]{});
    }
}