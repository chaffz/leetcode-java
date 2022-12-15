package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignOfTheProductOfAnArrayTest {
    SignOfTheProductOfAnArray productOfAnArray = new SignOfTheProductOfAnArray();

    @Test
    public void arraySign() {
        Assert.assertEquals(signFunc(productOfAnArray.arraySign(ArrayInput.asArray("[-1,-2,-3,-4,3,2,1]"))), 1);
    }

    private int signFunc(int i) {
        if (i > 0) return 1;
        else if (i < 0) return -1;
        return 0;
    }
}