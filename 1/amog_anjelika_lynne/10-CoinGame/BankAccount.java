import java.io.*;
import java.util.*;

public class BankAccount{
    private double balance, interestRate;
    private String name;
    private int acctnumber;
    public BankAccount(String n, double b){
	name = n;
	balance = b;
	interestRate = 0.02;
	acctnumber = 1001;
    }
    public void deposit(double amt){
	if (amt > 0){
	    balance = balance + amt;
	}
    }
    public void withdraw(double amt){
	if (amt > 0 && balance > amt){
	    balance = balance - amt;
	}
    }
    public double getBalance(){
	return balance;
    }
    public void takeMoneyFrom(BankAccount other, double amt){
	if (amt > other.balance){
	    other.withdraw(amt);
	    balance = balance + amt;
	}
    }
    public void giveMoneyTo(BankAccount other, double amt){
	if (amt > balance){
	    balance = balance - amt;
	    other.deposit(amt);
	}
    }
}