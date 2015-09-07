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
		// ��ȡweb��Դ
		ServletRequest req = ServletActionContext.getRequest();
		// ǿ��ת��Ϊhttpservletrequest
		HttpServletRequest request = (HttpServletRequest) req;
		// ��ȡhttpsession����
		HttpSession session = request.getSession();
		session.invalidate();
		return ERROR;
	}

}
