package cn.isnap.leetcode.algorithm.level2.day02;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindPeakElementTest {
    FindPeakElement findPeakElement = new FindPeakElement();

    @Test
    public void findPeakElement() {
        Assert.assertEquals(findPeakElement.findPeakElement(ArrayInput.asArray("[1,2,1,3,5,6,4]")), 5);
        Assert.assertEquals(findPeakElement.findPeakElement(ArrayInput.asArray("[1]")), 0);
    }
}