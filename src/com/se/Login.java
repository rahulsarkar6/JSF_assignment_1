package com.se;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name="Login")
@SessionScoped

public class Login implements Serializable {

	private String user;
	private String pwd;

	public String getUser()
	{
		return user;
	}
	
	public void setUser(String user)
	{
		this.user = user;
		
	}
	
	public String getPwd()
	{
		return pwd;
	}
	
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
		
	}
	
	//validate login
	public String validateUsernamePassword() {
		
		if(user.equals("Admin") && pwd.equals("Admin")) {
			
			return "success";
		}
		else {
			
			return "error";
		}
	}

	//logout event, invalidate session
	
}