package com.hand.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hand.daoImpl.CustomerDaoImpl;
import com.hand.entity.Customer;
import com.hand.util.ConnectionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	Customer customer;
	String username;
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String execute() throws Exception {
		if (checkLogin()) {
			return "Loginsuccess";
		} else {
			return ERROR;
		}
	}

	public boolean checkLogin() {
		// 获取web资源
		ServletRequest req = ServletActionContext.getRequest();
		// 强制转换为httpservletrequest
		HttpServletRequest request = (HttpServletRequest) req;
		// 获取httpsession对象
		HttpSession session = request.getSession();

		CustomerDaoImpl cdi = new CustomerDaoImpl();
		if (cdi.isExist(username, password)) {
			session.setAttribute("flag", "login_success");
			session.setAttribute("username", username);
			return true;
		} else {
			return false;
		}

	}
	
	@Override
	public void validate() {
		if(username == null || username.trim().equals(""))
		{
			addFieldError("username", "The name is required");
		}
		if(password == null || password.trim().equals(""))
		{
			addFieldError("password", "The password is required");
		}
	}
}
