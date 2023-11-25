package cn.isnap.leetcode.backtrack;


import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class JsonFlatten {

  public Map<String, String> result = new HashMap<>();

  // 伪代码
  public void flatten1(String prefix, JsonNode objectNode) {
    Iterator<Map.Entry<String, JsonNode>> it = objectNode.fields();
    while (it.hasNext()) {
      Map.Entry<String, JsonNode> entry = it.next();
      String currKey = prefix + "." + entry.getKey();
      if (entry.getValue().isObject()) {
        flatten1(currKey, entry.getValue());
      } else {
        result.put(currKey, entry.getValue().asText());
      }
    }
  }

  // 伪代码
  public void flatten3(String prefix, JsonNode objectNode) {
    Object[] objects = new Object[]{prefix, objectNode};
    Stack<Object[]> stack = new Stack<>();
    stack.add(objects);

    // 不断从队列中取出对象进行处理
    while (!stack.isEmpty()) {
      objects = stack.pop();
      Iterator<Map.Entry<String, JsonNode>> it = ((JsonNode) objects[1]).fields();
      while (it.hasNext()) {
        Map.Entry<String, JsonNode> entry = it.next();
        String currKey = objects[0] + "." + entry.getKey();
        if (entry.getValue().isObject()) {
          // 添加到队列
          stack.push(new Object[]{currKey, entry.getValue()});
        } else {
          result.put(currKey, entry.getValue().asText());
        }
      }
    }
  }

  // 伪代码
  public void flatten2(String prefix, JsonNode objectNode) {
    Object[] objects = new Object[]{prefix, objectNode};
    Queue<Object[]> queue = new PriorityQueue<>();
    queue.add(objects);

    // 不断从队列中取出对象进行处理
    while (!queue.isEmpty()) {
      objects = queue.poll();
      Iterator<Map.Entry<String, JsonNode>> it = ((JsonNode) objects[1]).fields();
      while (it.hasNext()) {
        Map.Entry<String, JsonNode> entry = it.next();
        String currKey = objects[0] + "." + entry.getKey();
        if (entry.getValue().isObject()) {
          // 添加到队列
          queue.offer(new Object[]{currKey, entry.getValue()});
        } else {
          result.put(currKey, entry.getValue().asText());
        }
      }
    }
  }
}
