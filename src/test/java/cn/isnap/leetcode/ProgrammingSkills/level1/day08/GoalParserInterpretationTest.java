package cn.isnap.leetcode.ProgrammingSkills.level1.day08;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoalParserInterpretationTest {
    GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();

    @Test
    public void interpret() {
        Assert.assertEquals(goalParserInterpretation.interpret("G()(al)"), "Goal");
    }
}