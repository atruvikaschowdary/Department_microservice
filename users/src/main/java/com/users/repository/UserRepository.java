package com.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserId(int userId);

}
