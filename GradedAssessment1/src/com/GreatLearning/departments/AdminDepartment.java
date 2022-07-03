package com.GreatLearning.departments;

import com.GreatLearning.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	//Using super keyword to inherit the constructor from super class and overriding them, other than the todayHoliday variable 
	public AdminDepartment() {
		super();
		this.departmentName = "Admin Department";
		this.todaysWork = "Complete your documents Submission";
		this.workDeadline = "Complete by EOD ";
	}

	//We override the methods inherited from the SuperDepartment class 
	//and we make use of isTodayHoliday() from super class to display it in driver class
	public String getDepartmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

}
