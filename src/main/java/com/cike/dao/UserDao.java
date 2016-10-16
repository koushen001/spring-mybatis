package com.cike.dao;

import com.cike.po.User;

public interface UserDao {
	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;
}
