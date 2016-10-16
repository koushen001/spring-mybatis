package com.cike.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cike.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// 创建sqlSession
		SqlSession sqlSession = this.getSqlSession();
		// 根据id查询用户
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}

}
