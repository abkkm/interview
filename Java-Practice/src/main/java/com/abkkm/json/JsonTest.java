package com.abkkm.json;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		String jsonStr = "{\"a\":\"5614\",\"b\":\"11\",\"c\":\"205\",\"d\":\"5\",\"e\":\"0\"}";
		JSONObject parseObject = JSON.parseObject(jsonStr);
		Zm zm2 = parseObject.toJavaObject(Zm.class);
		String zm3 = parseObject.getObject("a", String.class);
		Zm zm = JSON.parseObject(jsonStr,Zm.class);
		String jsonArrStr = "[{\"a\":\"5614\",\"b\":\"11\",\"c\":\"205\",\"d\":\"5\",\"e\":\"0\"},{\"a\":\"5614\",\"b\":\"11\",\"c\":\"205\",\"d\":\"5\",\"e\":\"0\"}]";
		JSONArray jsonArray = JSON.parseArray(jsonArrStr);
		List<Zm> javaList = jsonArray.toJavaList(Zm.class);
		
		String jsonString = JSON.toJSONString(javaList);
		
		List<Zm> parseArray = JSON.parseArray(jsonArrStr,Zm.class);
		System.out.println(jsonString);
		
		return;
	}
}