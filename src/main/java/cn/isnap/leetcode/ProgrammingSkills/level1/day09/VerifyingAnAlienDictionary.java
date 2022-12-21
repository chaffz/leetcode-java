package cn.isnap.leetcode.ProgrammingSkills.level1.day09;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] indexes = new int[26];
        for (int i = 0; i < order.length(); i++) {
            indexes[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!isInOrder(words[i], words[i + 1], indexes))
                return false;
        }

        return true;
    }

    private boolean isInOrder(String word1, String word2, int[] order) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int index = 0;
        while (index < chars1.length && index < chars2.length) {
            int index1 = order[chars1[index] - 'a'];
            int index2 = order[chars2[index] - 'a'];
            index++;
            if (index1 == index2) continue;

            return index1 < index2;
        }

        return index == chars1.length;
    }
}
