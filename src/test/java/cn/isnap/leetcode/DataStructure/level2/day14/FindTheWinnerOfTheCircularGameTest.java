package cn.isnap.leetcode.DataStructure.level2.day14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheWinnerOfTheCircularGameTest {
    FindTheWinnerOfTheCircularGame circularGame = new FindTheWinnerOfTheCircularGame();

    @Test
    public void findTheWinner() {
        Assert.assertEquals(circularGame.findTheWinner(5, 2), 3);
        Assert.assertEquals(circularGame.findTheWinner(6, 5), 1);
    }
}