package cn.isnap.leetcode.DataStructure.level2.day05;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySumEqualsKTest {
    static SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

    @Test
    public void subarraySum() {
//        Assert.assertEquals(subarraySumEqualsK.subarraySum(
//                ArrayInput.asArray("[1,1,1]"), 2), 2);
//        Assert.assertEquals(subarraySumEqualsK.subarraySum(
//                ArrayInput.asArray("[1,2,3]"), 3), 2);
        Assert.assertEquals(subarraySumEqualsK.subarraySum(
                ArrayInput.asArray("[1,-1,0]"), 0), 3);
    }
}