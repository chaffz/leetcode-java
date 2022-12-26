package cn.isnap.leetcode.ProgrammingSkills.level2.day03;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if ("+".equals(token) ||
                    "-".equals(token) ||
                    "*".equals(token) ||
                    "/".equals(token)){
                Integer s1 = stack.pop();
                Integer s2 = stack.pop();
                stack.push(calc(s2, s1, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private int calc(Integer n1, Integer n2, String token) {
        switch (token) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
        }
        return 0;
    }
}
