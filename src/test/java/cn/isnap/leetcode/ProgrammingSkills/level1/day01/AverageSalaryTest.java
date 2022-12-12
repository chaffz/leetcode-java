package cn.isnap.leetcode.ProgrammingSkills.level1.day01;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageSalaryTest {
    AverageSalary averageSalary = new AverageSalary();

    @Test
    public void average() {
        Assert.assertEquals(averageSalary.average(ArrayInput.asArray("[4000,3000,1000,2000]")), 2500, 0.001);
    }
}