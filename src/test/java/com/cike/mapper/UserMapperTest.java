package com.cike.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.cike.po.User;

public class UserMapperTest {
	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		// 创建spring容器
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(JSON.toJSONString(user));
	}

}
