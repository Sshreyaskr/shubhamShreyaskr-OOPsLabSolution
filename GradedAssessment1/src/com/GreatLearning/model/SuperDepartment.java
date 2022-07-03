package com.GreatLearning.model;

public class SuperDepartment {
	
	public String departmentName=null;
	public String todaysWork=null;
	public String workDeadline=null;
	public String todayHoliday=null;
	
	public SuperDepartment() {
		this.departmentName="Super Department";
		this.todaysWork="No Work as of now";
		this.workDeadline="Nil";
		this.todayHoliday="Today is not a holiday";
	}
	
	//The methods to get the details & do not contains any parameters
	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getTodaysWork() {
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		return workDeadline;
	}
	
	public String isTodayAHoliday() {
		return todayHoliday;
	}
	
	

}
