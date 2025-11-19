package com.anudip.assignments;

public abstract class BankAccount {

	private String AccountHolderName;
	private int accountNUmber;
	public int balance;

	public BankAccount(String accountHolderName, int accountNUmber, int balance) {
		super();
		setAccountHolderName(accountHolderName);
		this.setAccountNUmber(accountNUmber);
		this.setBalance(balance);
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public int getAccountNUmber() {
		return accountNUmber;
	}

	public void setAccountNUmber(int accountNUmber) {
		this.accountNUmber = accountNUmber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [AccountHolderName=" + AccountHolderName + ", accountNUmber=" + accountNUmber + ", balance="
				+ balance + "]";
	}
	

	abstract int deposit();
	
	abstract int withdraw();
	

}
