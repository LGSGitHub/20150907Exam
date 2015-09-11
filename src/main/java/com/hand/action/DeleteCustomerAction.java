package com.hand.action;

import com.hand.daoImpl.CustomerDaoImpl;
import com.hand.entity.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCustomerAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short customer_id;

	public short getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(short customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String execute() throws Exception {
		Customer customer = new Customer();
		customer.setCustomer_id(customer_id);
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		cdi.delete(customer);

		return SUCCESS;
	}
}
