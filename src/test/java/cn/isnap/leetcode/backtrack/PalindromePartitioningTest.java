package cn.isnap.leetcode.backtrack;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PalindromePartitioningTest {
    PalindromePartitioning partitioning = new PalindromePartitioning();

    @Test
    public void partition() {
        List<List<String>> list = partitioning.partition("aab");
        Assert.assertEquals(JSON.toJSONString(list), "[[\"a\",\"a\",\"b\"],[\"aa\",\"b\"]]");
    }
}