package cn.isnap.leetcode.ProgrammingSkills.level2.day19;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    HashMap<String, Integer> tokens;
    int timeToLive;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        tokens = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        if(tokens.containsKey(tokenId) && tokens.get(tokenId) <= currentTime && tokens.get(tokenId) + timeToLive > currentTime) {
            tokens.put(tokenId, currentTime);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for(Map.Entry<String, Integer> e : tokens.entrySet())
            if(e.getValue() <= currentTime && currentTime < e.getValue() + timeToLive)
                count++;

        return count;
    }
}
