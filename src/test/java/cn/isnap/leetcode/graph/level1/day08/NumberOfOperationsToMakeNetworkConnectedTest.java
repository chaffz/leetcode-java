package cn.isnap.leetcode.graph.level1.day08;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOperationsToMakeNetworkConnectedTest {
    NumberOfOperationsToMakeNetworkConnected makeNetworkConnected = new NumberOfOperationsToMakeNetworkConnected();

    @Test
    public void makeConnected() {
        // [[0,1],[0,2],[0,3],[1,2],[1,3]]
        int connected = makeNetworkConnected.makeConnected(6, ArrayInput.as2DArray("[[0,1],[0,2],[0,3],[1,2],[1,3]]"));
        Assert.assertEquals(connected, 2);
    }
}