package cn.isnap.leetcode.backtrack;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.junit.Test;

import static org.junit.Assert.*;

public class JsonFlattenTest {

  @Test
  public void flatten() throws JsonProcessingException {
    JsonFlatten flatten = new JsonFlatten();
    String strJson = "{\n"
        + "  \"name\": {\n"
        + "    \"first\": \"John\",\n"
        + "    \"last\": \"Doe\"\n"
        + "  },\n"
        + "  \"age\": 30,\n"
        + "  \"email\": \"john.doe@example.com\"\n"
        + "}";
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode = objectMapper.reader().readTree(strJson);
    flatten.flatten3("", jsonNode);
    System.out.println(flatten.result);
  }
}