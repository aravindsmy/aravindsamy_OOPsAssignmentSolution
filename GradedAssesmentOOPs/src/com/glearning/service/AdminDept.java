package com.glearning.service;

public class AdminDept extends SuperDept {

	@Override
	public String departmentName() {
		return " Admin Department ";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD  ";
	}
}
