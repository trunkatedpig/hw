import java.io.*;
import java.util.*;

public class BankAccount{
    private String name;
    private double balance;
    private int account;

    public BankAccount(String n){
	name = n;
	account = (int)(Math.random()*10000);
	balance = 0;
    }
    
    public void deposit(double money){
	balance = balance + money;
    }

    public void withdraw(double money){
	if (balance >= money){
	    balance = balance - money;
	}
    }

    public double getBalance(){
	return balance;
    }

    public void takeMoneyFrom(BankAccount name, double money){
	if (name.getBalance() >= money){
	    name.withdraw(money);
	    deposit(money);
	}
    }

    public void giveMoneyto(BankAccount name, double money){
	if (balance >= money){
	    balance = balance - money;
	    name.deposit(money);
	}
    }

}
