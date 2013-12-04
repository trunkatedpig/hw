import java.io.*;
import java.util.*;

public class BankAccount {
    public double balance = 0.00;
    public String name;

    public void deposit(double amt) {
	balance = balance + amt;
    }

    public void withdraw(double amt) {
	if (balance >= amt) {
	    balance = balance - amt;
	}
    }

    public double getBalance() {
	return Math.round(balance * 100.0) / 100.0;
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
	    other.balance = other.balance + amt;
	}
    }
}
