package com.ssafy.service;

import java.util.List;

import com.ssafy.dto.User;

public interface LoginService {
	
	String login(String id, String password);
	void add(User user);
	List<User> searchAll();
	User search(String id);
	void update(User user);
	void delete(String id);
}
