package cn.isnap.leetcode.lc75.level1.day15;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopKFrequentWordsTest {

    @Test
    public void topKFrequent() {
        TopKFrequentWords tf = new TopKFrequentWords();
        List<String> r = tf.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2);
        Assert.assertEquals(r.toArray(), new String[]{"i", "love"});
    }
}