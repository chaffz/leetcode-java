package cn.isnap.leetcode.lc75.level1.day02;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] sToT = new int[128];
        int[] tToS = new int[128];

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToT[sChar] != tToS[tChar]) {
                return false;
            }

            sToT[sChar] = i+1;
            tToS[tChar] = i+1;
        }

        return true;
    }
}
