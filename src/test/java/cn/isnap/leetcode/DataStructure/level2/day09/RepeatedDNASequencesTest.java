package cn.isnap.leetcode.DataStructure.level2.day09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedDNASequencesTest {
    RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences();

    @Test
    public void findRepeatedDnaSequences() {
        Assert.assertEquals(repeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT").toString(),
                "[AAAAACCCCC, CCCCCAAAAA]");
        Assert.assertEquals(repeatedDNASequences.findRepeatedDnaSequences("AAAAAAAAAAAAA").toString(),
                "[AAAAAAAAAA]");
    }
}