package com.hand.entity;

public class Address {
	
	private Short addressId;
	private String address;
	private String address2;
	public Short getAddressId() {
		return addressId;
	}
	public void setAddressId(Short addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", address2=" + address2 + "]";
	}
	

}
