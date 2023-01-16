package cn.isnap.leetcode.ProgrammingSkills.level2.day19;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    Map<String, Integer> tokens = new HashMap<>();
    Integer timeToLive;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + this.timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.getOrDefault(tokenId, 0) < currentTime) return;
        tokens.put(tokenId, currentTime + this.timeToLive);
    }

    public int countUnexpiredTokens(int currentTime) {
        return (int) tokens.values().stream().filter(t -> t >= currentTime).count();
    }
}
