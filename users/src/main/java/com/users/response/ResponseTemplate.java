package com.users.response;

import com.users.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

	User user;
	Department responseDepartment;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getResponseDepartment() {
		return responseDepartment;
	}

	public void setResponseDepartment(Department responseDepartment) {
		this.responseDepartment = responseDepartment;
	}

	@Override
	public String toString() {
		return "ResponseTemplate [user=" + user + ", responseDepartment=" + responseDepartment + ", getUser()="
				+ getUser() + ", getResponseDepartment()=" + getResponseDepartment() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
