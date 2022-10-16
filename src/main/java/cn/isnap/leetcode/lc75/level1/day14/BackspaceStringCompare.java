package cn.isnap.leetcode.lc75.level1.day14;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        int n = Math.max(sArr.length, tArr.length);

        int i = 0;
        for (; i < n; i++) {
            if (i < sArr.length)
                charArray2Stack(sStack, sArr[i]);
            if (i < tArr.length)
                charArray2Stack(tStack, tArr[i]);
        }

        return sStack.equals(tStack);
    }

    private void charArray2Stack(Stack<Character> sStack, char c) {
        if (c == '#') {
            if (!sStack.isEmpty())
                sStack.pop();
        } else {
            sStack.push(c);
        }
    }
}
