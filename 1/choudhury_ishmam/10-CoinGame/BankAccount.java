import java.io.*;
import java.util.*;

public class BankAccount{
	private double bal;
	private String name;
	private double interestRate;
	private int acctNumber;
	
	public BankAccount(String pn, int acct) {
		name = pn;
		acctNumber = acct;
	}
		
	public void deposit(double amt) {
		bal = bal + amt;
	}
	
	public void withdraw(double amt) {
	/* MUST check if you have available to 
		withdraw. Can't have -bal*/
		if (bal >= amt) {
			bal = bal - amt;
		}
	}
		
	//get function	
	public double getBal() {
		return bal;
		}
		
	//integrating other BankAccounts
	public void takeMoneyFrom(BankAccount other, double amt) {
		if (other.bal >= amt) {
			other.withdraw(amt);
			this.deposit(amt);
		}
	}
	
	public void giveMoneyTo(BankAccount other, double amt) {
		if (bal >= amt) {
			this.bal = this.bal - amt;
			other.bal = other.getBal() + amt;
		}
	}
	
}