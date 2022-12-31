package cn.isnap.leetcode.ProgrammingSkills.level2.day06;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {
    DailyTemperatures dailyTemperatures = new DailyTemperatures();

    @Test
    public void dailyTemperatures() {
        Assert.assertArrayEquals(dailyTemperatures.dailyTemperatures(ArrayInput.asArray("[73,74,75,71,69,72,76,73]")),
                ArrayInput.asArray("[1,1,4,2,1,1,0,0]"));
    }
}