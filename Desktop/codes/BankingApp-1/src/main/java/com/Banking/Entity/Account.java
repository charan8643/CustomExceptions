package com.Banking.Entity;

import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="account_holder_name")
    private String accountHolderName;

    private double balance;

    public Account() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
    
}