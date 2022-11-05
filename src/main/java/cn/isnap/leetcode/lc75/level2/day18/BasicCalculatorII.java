package cn.isnap.leetcode.lc75.level2.day18;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+';
        for (char c : chars) {
            if (c == ' ') continue;

            if (c >= '0' && c <= '9') {
                num *= 10;
                num += c - '0';
            } else {
                handleOp(stack, op, num);
                op = c;
                num = 0;
            }
        }

        handleOp(stack, op, num);
        num = 0;
        while (!stack.isEmpty())
            num += stack.pop();
        return num;
    }

    private void handleOp(Stack<Integer> stack, char op, int num) {
        switch (op) {
            case '+':
                stack.push(num);
                break;
            case '-':
                stack.push(-num);
                break;
            case '*':
                stack.push(stack.pop() * num);
                break;
            case '/':
                stack.push(stack.pop() / num);
                break;
            default:
        }
    }
}
