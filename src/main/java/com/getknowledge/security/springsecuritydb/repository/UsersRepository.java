package com.getknowledge.security.springsecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getknowledge.security.springsecuritydb.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	
	
}
