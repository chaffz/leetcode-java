package cn.isnap.leetcode.ProgrammingSkills.level1.day06;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {
    RichestCustomerWealth richestCustomer = new RichestCustomerWealth();

    @Test
    public void maximumWealth() {
        Assert.assertEquals(richestCustomer.maximumWealth(ArrayInput.as2DArray("[[2,8,7],[7,1,3],[1,9,5]]")), 17);
    }
}