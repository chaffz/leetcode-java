package cn.isnap.leetcode.ProgrammingSkills.level2.day03;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

    @Test
    public void evalRPN() {
        String[] tokens = ArrayInput.asStringArray("[\"2\",\"1\",\"+\",\"3\",\"*\"]");
//        Assert.assertEquals(evaluateReversePolishNotation.evalRPN(tokens), 9);
        Assert.assertEquals(evaluateReversePolishNotation.evalRPN(
                ArrayInput.asStringArray("[\"4\",\"13\",\"5\",\"/\",\"+\"]")), 6);
    }
}