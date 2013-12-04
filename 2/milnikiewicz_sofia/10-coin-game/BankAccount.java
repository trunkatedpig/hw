import java.io.*;
import java.util.*;

public class BankAccount {
    private double balance;
    
    public BankAccount() {
	balance = 0.0;
    }

    public BankAccount(double amt){
	balance = amt;
    }

    public void deposit(double amt){
	balance = balance + amt;
    }

    public void withdraw(double amt){
	balance = balance - amt;
    }

    public double getBalance(){
	return balance;
    }
    
    public void giveMoney(BankAccount other, double amt){
	other.deposit(amt);
	this.withdraw(amt);
    }

    public void takeMoney(BankAccount other, double amt){
	other.giveMoney(this, amt);
    }
}
