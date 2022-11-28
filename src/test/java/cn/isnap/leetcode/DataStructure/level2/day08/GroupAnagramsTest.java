package cn.isnap.leetcode.DataStructure.level2.day08;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {
    static GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void groupAnagrams() {
        List<List<String>> r = groupAnagrams.groupAnagrams(ArrayInput.asStringArray("[\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]"));
        System.out.println(r);
    }
}