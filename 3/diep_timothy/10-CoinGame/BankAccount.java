import java.io.*;
import java.util.*;

public class BankAccount {
    private double balance;

    public void deposit(double amt) {
	balance = balance + amt;
    }

    public void withdraw(double amt) {
	if (balance >= amt) {
	    balance = balance - amt;
	}
    }

    public double getBalance() {
	return balance;
    }

    public void takeMoneyFrom(BankAccount other, double amt) {
	if (other.balance >= amt) {
	    other.withdraw(amt);
	    this.deposit(amt);
	}
    }

    public void giveMoneyTo(BankAccount other, double amt) {
	if (balance >= amt) {
	    balance = balance - amt;
	    other.balanace = other.balance + amt;
	}
    }
}