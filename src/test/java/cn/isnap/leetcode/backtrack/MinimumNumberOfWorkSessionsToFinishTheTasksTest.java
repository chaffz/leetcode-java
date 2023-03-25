package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNumberOfWorkSessionsToFinishTheTasksTest {
  MinimumNumberOfWorkSessionsToFinishTheTasks finishTheTasks = new MinimumNumberOfWorkSessionsToFinishTheTasks();

  @Test
  public void minSessions() {
    Assert.assertEquals(finishTheTasks.minSessions(ArrayInput.asArray("[3,1,3,1,1]"), 8), 2);
    Assert.assertEquals(finishTheTasks.minSessions(ArrayInput.asArray("[1,2,3,4,5]"), 15), 1);
    Assert.assertEquals(finishTheTasks.minSessions(ArrayInput.asArray("[1,2,3]"), 3), 2);
    Assert.assertEquals(finishTheTasks.minSessions(ArrayInput.asArray("[2,2,1,3,3,1]"), 3), 4);

  }
}