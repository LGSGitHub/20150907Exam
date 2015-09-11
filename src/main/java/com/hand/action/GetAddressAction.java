package com.hand.action;

import com.hand.daoImpl.AddressDaoImpl;

public class GetAddressAction {
	String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String execute()
	{
		System.out.println("µ÷ÓÃÁËgetAddress  Action");
		AddressDaoImpl adi = new AddressDaoImpl();
		data = adi.getAddress();
		return "success";
	}

}
