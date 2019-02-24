package com.sly.demo.thymeleaf;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author sly
 * @time 2019年2月14日
 */
public class CommonTest {
	
	@Test
	public void test01() {
		Map<String, Object> map = new HashMap<>();
		map.put("String", "stringValue");
		String jsonString = JSON.toJSONString(map);
		System.out.println(jsonString);
	}
	
	@Test
	public void test02() {
		String jsonString = JSON.toJSONString("StringValue");
		System.out.println(jsonString);
	}
	
	
}
