package com.ssafy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssafy.dto.User;

@Repository
public interface LoginRepository {
	void add(User user);
	List<User> searchAll();
	User search(String id);
	void update(User user);
	void delete(String id);
	String login(String id, String password);
}
