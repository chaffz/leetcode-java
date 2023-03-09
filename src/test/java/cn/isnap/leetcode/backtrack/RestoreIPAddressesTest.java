package cn.isnap.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestoreIPAddressesTest {
    RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();

    @Test
    public void restoreIpAddresses() {
        Assert.assertEquals(restoreIPAddresses.restoreIpAddresses("25525511135")
                .toString().replaceAll(" ", ""), "[\"255.255.11.135\",\"255.255.111.35\"]");
    }
}