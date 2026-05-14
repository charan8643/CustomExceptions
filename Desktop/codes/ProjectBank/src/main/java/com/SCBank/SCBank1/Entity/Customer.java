package com.SCBank.SCBank1.Entity;

import org.hibernate.annotations.GeneratedColumn;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity

//@Table(name="AccountHolder")
public class Customer {
	

	@Id
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	private long phone;
	private String accountHolderName;
	public int getAccountNumber() {
		return id;
	}
	
	public Customer () {
		
	}
	public void setAccountNumber(int accountNumber) {
		id = accountNumber;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		accountHolderName = accountHolderName;
	}
	public Customer(int accountNumber, long phone, String accountHolderName) {
		super();
		id = accountNumber;
		this.phone = phone;
		accountHolderName = accountHolderName;
	}
	@Override
	public String toString() {
		return "Customer [AccountNumber=" + id + ", phone=" + phone + ", accountHolderName="
				+ accountHolderName + "]";
	}
//
//	public Customer orElseThrow(Object object) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	

}
