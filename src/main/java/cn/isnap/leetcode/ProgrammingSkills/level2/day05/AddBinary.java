package cn.isnap.leetcode.ProgrammingSkills.level2.day05;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int i = chars1.length - 1, j = chars2.length - 1;
        StringBuilder builder = new StringBuilder(chars1.length);
        int over = 0;
        while (i >= 0 || j >= 0) {
            int sum = over;
            over = 0;
            if (i >= 0) {
                sum += chars1[i--] - '0';
            }
            if (j >= 0) {
                sum += chars2[j--] - '0';
            }
            if (sum == 2) {
                sum = 0;
                over = 1;
            } else if (sum == 3) {
                sum = 1;
                over = 1;
            }
            builder.insert(0, sum);
        }

        if (over > 0) {
            builder.insert(0, over);
        }

        return builder.toString();
    }
}
