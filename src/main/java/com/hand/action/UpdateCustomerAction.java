package com.hand.action;

import com.hand.daoImpl.AddressDaoImpl;
import com.hand.daoImpl.CustomerDaoImpl;
import com.hand.entity.Address;
import com.hand.entity.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateCustomerAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private String address;
//	private Address addressClass;
//	private Customer customer;

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public short getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(short customer_id) {
		this.customer_id = customer_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public Address getAddressClass() {
//		return addressClass;
//	}
//
//	public void setAddressClass(Address addressClass) {
//		this.addressClass = addressClass;
//	}

	public UpdateCustomerAction() {
		
	}

	@Override
	public String execute() throws Exception {
		Customer customer = new Customer();
		AddressDaoImpl adi = new AddressDaoImpl();
		Address addressClass = adi.getAddressClass(address);
		
		customer.setAddress(addressClass);
		customer.setFirst_name(first_name);
		customer.setLast_name(last_name);
		customer.setEmail(email);
		customer.setCustomer_id(customer_id);
		
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		cdi.update(customer);
		return SUCCESS;
	}
}
