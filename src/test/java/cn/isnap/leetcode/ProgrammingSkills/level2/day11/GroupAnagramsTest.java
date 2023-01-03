package cn.isnap.leetcode.ProgrammingSkills.level2.day11;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Test;

import java.util.List;

public class GroupAnagramsTest {
    static GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void groupAnagrams() {
        List<List<String>> r = groupAnagrams.groupAnagrams(ArrayInput.asStringArray("[\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]"));
        System.out.println(r);
    }
}