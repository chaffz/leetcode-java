package cn.isnap.leetcode.lc75.level2.day18;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> seenAsteroids = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                seenAsteroids.push(asteroid);
            } else {
                int absAsteroid = Math.abs(asteroid);
                while (!seenAsteroids.isEmpty() && seenAsteroids.peek() > 0
                        && seenAsteroids.peek() < absAsteroid)
                    seenAsteroids.pop();

                if (!seenAsteroids.isEmpty() && seenAsteroids.peek() == absAsteroid) {
                    seenAsteroids.pop();
                } else if (!seenAsteroids.isEmpty() && seenAsteroids.peek() < absAsteroid) {
                    seenAsteroids.push(asteroid);
                }
            }
        }

        int[] output = new int[seenAsteroids.size()];
        int x = seenAsteroids.size() - 1;
        while (!seenAsteroids.isEmpty())
            output[x--] = seenAsteroids.pop();

        return output;
    }
}
