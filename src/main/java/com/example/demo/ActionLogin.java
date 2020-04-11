package com.example.demo;

import com.opensymphony.xwork2.ActionSupport;

public class ActionLogin extends ActionSupport{
	//business logic
	public String verifyUser() {
		if(userid.equals("java") && pwd.equals("jee")) {
			firstName="john";
			LastName="doe";
			return "success";
		}else
			return "failure";
	}
	
	
	//source web page form bean from home.html page
	public String userid;
	public String pwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//destination webpage from bean this is response
		public String firstName;
		public String LastName;
		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
}
