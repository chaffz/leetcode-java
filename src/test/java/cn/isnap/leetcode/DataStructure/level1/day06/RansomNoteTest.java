package cn.isnap.leetcode.DataStructure.level1.day06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void canConstruct() {
        RansomNote rn = new RansomNote();
        String ransomNote = "a", magazine = "b";
        Assert.assertFalse(rn.canConstruct(ransomNote, magazine));
        ransomNote = "aa"; magazine = "aab";
        Assert.assertTrue(rn.canConstruct(ransomNote, magazine));
    }
}