package com.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.users.entity.User;
import com.users.response.ResponseTemplate;
import com.users.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
//@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	UserService userService;

	Logger log = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/user/{id}")
	public ResponseTemplate getUserfromDepartment(@PathVariable("id") int userId) {
		ResponseTemplate responseTemplate = null;
		try {
			responseTemplate = userService.getUserfromDepartment(userId);
			log.info("UserController", "getUserfromDepartment");
		} catch (Exception e) {
			log.error("", e);
			e.printStackTrace();
		}
		return responseTemplate;
	}

	@PostMapping("/user/save")
	public User saveUser(@RequestBody User user) {
		try {
			userService.saveUser(user);
			log.info("UserController", "save User");
		} catch (Exception e) {
			log.error("Error Occured", e);
			e.printStackTrace();
		}
		return user;
	}
}
