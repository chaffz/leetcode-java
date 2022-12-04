package cn.isnap.leetcode.DataStructure.level2.day14;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(sb.length());
            } else if (aChar == ')') {
                if (stack.isEmpty()) continue;
                Integer top = stack.peek();
                if (sb.charAt(top) != '(') continue;
                stack.pop();
            }
            sb.append(aChar);
        }

        while (!stack.isEmpty()) {
            Integer top = stack.pop();
            sb.deleteCharAt(top);
        }

        return sb.toString();
    }
}
