package com.ssafy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.dto.User;
import com.ssafy.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private SqlSession session;

	@Override
	public void add(User user) {
		session.getMapper(LoginRepository.class).add(user);
	}
	@Override
	public List<User> searchAll() {
		return session.getMapper(LoginRepository.class).searchAll();
	}

	@Override
	public User search(String id) {
		return session.getMapper(LoginRepository.class).search(id);
	}

	@Override
	public void update(User user) {
		session.getMapper(LoginRepository.class).update(user);
	}

	@Override
	public void delete(String id) {
		session.getMapper(LoginRepository.class).delete(id);
	}
	@Override
	public String login(User user) {
		return session.getMapper(LoginRepository.class).login(user);
	}
	
}
