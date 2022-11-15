package cn.isnap.leetcode.DataStructure.level1.day09;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private final static char[] config = new char[128];
    static {
        config['{'] = '}';
        config['['] = ']';
        config['('] = ')';
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (config[aChar] > 0) {
                stack.push(aChar);
            } else {
                if (stack.isEmpty()) return false;

                Character c = stack.pop();
                if (config[c] != aChar) return false;
            }
        }

        return stack.isEmpty();
    }
}
