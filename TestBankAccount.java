package com.anudip.assignments;

public class TestBankAccount {

	public static void main(String[] args) {

		SavingsAccount account1 = new SavingsAccount("Pratik", 98744, 34500,500,980);
		
		System.out.println("The details of the Account 1 is :"+account1);
		System.out.println("===========================");
		System.out.println("The name of the Acoount holder is :"+account1.getAccountHolderName());
		System.out.println("===========================");
		System.out.println("The account number of the account is :"+ account1.getAccountNUmber());
		System.out.println("===========================");
		System.out.println("The account balance of the account is :"+account1.balance);
		System.out.println("===========================");
		System.out.println("The balalance after deposit is "+account1.deposit());
		System.out.println("===========================");
		System.out.println("The balance after withdraw is "+account1.withdraw());
		System.out.println("===========================");
		
		int status = 5000;
		
		if(account1.balance>=status) {
			
			System.out.println("Minimum Balance is Maintained");
			
		}else {
			System.out.println("Minimum Balance is not Maintained");
		}
	}

}
 