package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitioningTest {
    PalindromePartitioning partitioning = new PalindromePartitioning();

    @Test
    public void partition() {
        Assert.assertEquals(partitioning.partition("aab").toString().replaceAll(" ", ""),
                "[[\"a\",\"a\",\"b\"],[\"aa\",\"b\"]]");
    }
}