package com.ssafy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.dto.User;


public interface LoginService {
	
	String login(User user);
	void add(User user);
	List<User> searchAll();
	User search(String id);
	void update(User user);
	void delete(String id);
}
