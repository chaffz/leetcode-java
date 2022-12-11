package cn.isnap.leetcode.DataStructure.level2.day21;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortCharactersByFrequencyTest {
    SortCharactersByFrequency frequency = new SortCharactersByFrequency();

    @Test
    public void frequencySort() {
        Assert.assertEquals(frequency.frequencySort("tree"), "eert");
        Assert.assertEquals(frequency.frequencySort("Aabb"), "bbAa");
    }
}