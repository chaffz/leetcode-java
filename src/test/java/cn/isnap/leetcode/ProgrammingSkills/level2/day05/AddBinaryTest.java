package cn.isnap.leetcode.ProgrammingSkills.level2.day05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void addBinary() {
        Assert.assertEquals(addBinary.addBinary("11", "1"), "100");
        Assert.assertEquals(addBinary.addBinary("1010", "1011"), "10101");
        Assert.assertEquals(addBinary.addBinary("1111", "1111"), "11110");
    }
}