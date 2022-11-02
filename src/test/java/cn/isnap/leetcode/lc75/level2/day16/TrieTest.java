package cn.isnap.leetcode.lc75.level2.day16;

import org.junit.Assert;
import org.junit.Test;

public class TrieTest {

    @Test
    public void search() {
        Trie obj = new Trie();
        String word = "word";
        String prefix = "h";
        obj.insert(word);
        boolean param_2 = obj.search(word);
        Assert.assertTrue(param_2);
        boolean param_3 = obj.startsWith(prefix);
        Assert.assertFalse(param_3);
        Assert.assertFalse(obj.search("wo"));
    }
}