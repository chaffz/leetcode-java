package cn.isnap.leetcode.lc75.level2.day02;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        char[] prefix = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean bk = true;

        for (int j = 0; j < prefix.length; j++) {
            bk = false;
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length()) {
                    bk = true;
                    break;
                }

                char c = strs[i].charAt(j);
                if (c != prefix[j])  {
                    bk = true;
                    break;
                }
            }

            if (!bk)
                sb.append(prefix[j]);
            else
                break;
        }

        return sb.toString();
    }
}
