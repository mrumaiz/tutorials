package com.rumaiz.struts2Test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rumaiz.struts2Test.bd.UserBD;

public class UserSpringAction extends ActionSupport{
	private UserBD userBD;

	public UserBD getUserBD() {
		return userBD;
	}

	public void setUserBD(UserBD userBD) {
		this.userBD = userBD;
	}
	
	public String execute() throws Exception {
		getUserBD().printUser();
		return "success";
	}
}
