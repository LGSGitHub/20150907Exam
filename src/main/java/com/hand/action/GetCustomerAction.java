package com.hand.action;

import com.hand.daoImpl.CustomerDaoImpl;


public class GetCustomerAction {

	String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String execute(){
		System.out.println("µ˜”√¡Àgetcustomer  Action");
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		data = cdi.getCustomer();
		return "success";
	}
}
