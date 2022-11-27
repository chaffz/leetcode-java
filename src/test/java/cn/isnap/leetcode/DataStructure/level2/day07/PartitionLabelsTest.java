package cn.isnap.leetcode.DataStructure.level2.day07;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionLabelsTest {
    static PartitionLabels partitionLabels = new PartitionLabels();

    @Test
    public void partitionLabels() {
        Assert.assertArrayEquals(
                partitionLabels.partitionLabels("ababcbacadefegdehijhklij").
                        stream().
                        mapToInt(Integer::intValue).
                        toArray(),
                ArrayInput.asArray("[9,7,8]"));
    }
}