package cn.isnap.leetcode.ProgrammingSkills.level1.day08;

import java.util.Stack;

public class GoalParserInterpretation {

    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        char[] chars = command.toCharArray();
        int type = 0; // 1 start 2 al
        for (char c : chars) {
            if (c == 'G') {
                builder.append(c);
            } else if (c == '(') {
                type++;
            } else if (c == ')') {
                type--;
                if (type == 0) {
                    builder.append('o');
                } else {
                    builder.append("al");
                    type = 0;
                }
            } else {
                if (type == 1) {
                    type++;
                }
            }
        }
        return builder.toString();
    }
}
