package cn.isnap.leetcode.DataStructure.level2.day06;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        StringBuilder result = new StringBuilder();
        int outer = 0;
        int i = chars1.length - 1, j = chars2.length - 1;
        for (; i >= 0 || j >= 0 || outer > 0; i--, j--) {
            int num = outer;
            if (i >= 0) {
                num += chars1[i] - '0';
            }
            if (j >= 0) {
                num += chars2[j] - '0';
            }

            result.insert(0, (num % 10));
            outer = num / 10;
        }

        return result.toString();
    }
}
