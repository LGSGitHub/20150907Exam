package com.hand.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	// request.getSession().invalidate();

	@Override
	public String execute() throws Exception {
		// 获取web资源
		ServletRequest req = ServletActionContext.getRequest();
		// 强制转换为httpservletrequest
		HttpServletRequest request = (HttpServletRequest) req;
		// 获取httpsession对象
		HttpSession session = request.getSession();
		session.invalidate();
		return ERROR;
	}

}
