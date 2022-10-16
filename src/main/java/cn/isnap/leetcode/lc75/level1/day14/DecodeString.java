package cn.isnap.leetcode.lc75.level1.day14;


import java.util.Stack;

public class DecodeString {
    int idx = 0;
    public String decodeString(String s) {
        idx = 0;
        return buildString(s);
    }

    public String buildString(String str) {
        StringBuilder sb = new StringBuilder();
        while (idx < str.length()) {
            if (Character.isDigit(str.charAt(idx))) {
                int nextOpenIdx = str.indexOf('[', idx);
                int multiply = Integer.parseInt(str.substring(idx, nextOpenIdx));
                idx = nextOpenIdx + 1;
                String subString = buildString(str);
                while (--multiply >= 0) sb.append(subString);
            } else if (str.charAt(idx) == ']') {
                idx++;
                return sb.toString();
            } else {
                sb.append(str.charAt(idx++));
            }
        }
        return sb.toString();
    }
}
