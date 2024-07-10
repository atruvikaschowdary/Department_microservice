package com.users.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {

	private int departmentId;
	private String departmentName;
	private String departmentType;
	private String departmentAddress;
	private String departmentCode;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "ResponseDepartment [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentType=" + departmentType + ", departmentAddress=" + departmentAddress
				+ ", departmentCode=" + departmentCode + ", getDepartmentId()=" + getDepartmentId()
				+ ", getDepartmentName()=" + getDepartmentName() + ", getDepartmentType()=" + getDepartmentType()
				+ ", getDepartmentAddress()=" + getDepartmentAddress() + ", getDepartmentCode()=" + getDepartmentCode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
