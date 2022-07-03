package com.GreatLearning.departments;

import com.GreatLearning.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	//We declare a new variable here & inherit all others from the the super class SuperDepartment
	String techStackInformation = null;

	public TechDepartment() {
		super();
		this.departmentName = "Tech Department ";
		this.todaysWork = "Complete coding of module 1";
		this.workDeadline = "Complete by EOD ";
		this.techStackInformation = "Core Java";
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechStackInformation() {
		return techStackInformation;
	}

}
