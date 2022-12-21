package cn.isnap.leetcode.ProgrammingSkills.level1.day09;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class VerifyingAnAlienDictionaryTest {
    VerifyingAnAlienDictionary alienDictionary = new VerifyingAnAlienDictionary();

    @Test
    public void isAlienSorted() {
        String[] arr = ArrayInput.asStringArray("[\"hello\",\"leetcode\"]");
        Assert.assertTrue(alienDictionary.isAlienSorted(arr, "hlabcdefgijkmnopqrstuvwxyz"));
    }
}