package com.bms.account;

import com.bms.constants.AccountStatus;

public class Account {
	private String username;
	private String password;
	private AccountStatus status;
	
	
	
	
	public Account(String username, String password, AccountStatus status) {
		this.username = username;
		this.password = password;
		this.status = status;
	}
	
	
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
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	
	
}
