package com.GreatLearning.departments;

import com.GreatLearning.model.SuperDepartment;

public class HRDepartment extends SuperDepartment{

	//We declare a new variable here & inherit all others from the the super class SuperDepartment
	String activity=null;
	
	public HRDepartment() {
		super();
		this.departmentName = "Hr Department ";
		this.todaysWork = "Fill today’s worksheet and mark your attendance";
		this.workDeadline = "Complete by EOD ";
		this.activity="Team lunch";
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
	
	public String doActivity() {
		return activity;
	}
}
