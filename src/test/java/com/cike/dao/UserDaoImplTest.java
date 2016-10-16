package com.cike.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.cike.po.User;

public class UserDaoImplTest {
	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		// 创建spring容器
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		// 从spring容器中获取UserDao这个Bean
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(JSON.toJSONString(user));
	}

}
