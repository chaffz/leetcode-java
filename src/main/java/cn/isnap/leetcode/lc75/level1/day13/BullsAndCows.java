package cn.isnap.leetcode.lc75.level1.day13;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int[] mapSecret = new int[10];
        int[] mapGuess = new int[10];
        int Bulls = 0, Cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char cSecret = secret.charAt(i);
            char cGuess = guess.charAt(i);

            if (cSecret == cGuess) {
                Bulls++;
                continue;
            }

            mapSecret[cSecret - '0']++;
            mapGuess[cGuess - '0']++;
        }

        for (int i = 0; i < mapSecret.length; i++) {
            Cows += Math.min(mapGuess[i], mapSecret[i]);
        }

        return String.format("%dA%dB", Bulls, Cows);
    }
}
