package com.users.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.users.entity.User;
import com.users.repository.UserRepository;
import com.users.response.Department;
import com.users.response.ResponseTemplate;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	Logger log = LoggerFactory.getLogger(UserService.class);

	public ResponseTemplate getUserfromDepartment(int userId) {
		ResponseTemplate responseTemplate = new ResponseTemplate();
		try {
			User user = userRepository.findByUserId(userId);
			log.info("get User");
			Department department = restTemplate
					.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
			responseTemplate.setUser(user);
			responseTemplate.setResponseDepartment(department);
		} catch (Exception e) {
			log.error("Error Occured", e);
			e.printStackTrace();
		}
		return responseTemplate;
	}

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		try {
			userRepository.save(user);
			log.info("save user method");
		} catch (Exception e) {
			log.error("Error Occured", e);
			e.printStackTrace();
		}
		return user;
	}

}
