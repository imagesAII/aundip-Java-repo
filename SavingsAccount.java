package com.anudip.assignments;

public class SavingsAccount extends BankAccount{
	
	private int depositAmt;
	private int withdrawAmt;
	
	public SavingsAccount(String accountHolderName, int accountNumber, int balance, int depositAmt, int withdrawAmt) {
        super(accountHolderName, accountNumber, balance);
        this.depositAmt = depositAmt;
        this.withdrawAmt = withdrawAmt;
    }

	

	public int getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(int depositAmt) {
		this.depositAmt = depositAmt;
	}

	public int getWithdrawAmt() {
		return withdrawAmt;
	}

	public void setWithdrawAmt(int withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}
	
	@Override
	int deposit() {
		return depositAmt + balance;
	}

	@Override
	int withdraw() {
		return balance - withdrawAmt;
	}

}
