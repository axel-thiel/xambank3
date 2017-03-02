package com.xamarinpocbanque.server.dto;

public class AccountDto {
	
	private String accountName;
	private String accoutNumber;
	private String accountCredit;
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccoutNumber() {
		return accoutNumber;
	}
	public void setAccoutNumber(String accoutNumber) {
		this.accoutNumber = accoutNumber;
	}
	public String getAccountCredit() {
		return accountCredit;
	}
	public void setAccountCredit(String accountCredit) {
		this.accountCredit = accountCredit;
	}

}
