
public class BankAccount {
    private double balance;
    private String name;
    private double interestRate;
    private int account;

    public BankAccount(String name, int account) {
	this.name = name;
	this.account = account;
	balance = 0;
	interestRate = 0;
    }

    private double nearestCent(double value) {
	value = value*100;
	value = Math.round(value);
	return value / 100;
    }

    public void deposit(double amt) {
	// if to make sure amt > 0 would be better
	balance = nearestCent(balance + amt);
    }

    public void withdraw(double amt) {
	// this if is important
	if (balance >= amt) {
	    balance = nearestCent(balance - amt);
	}
    }

    public void setBalance(double balance) {
	this.balance = balance;
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
	    other.balance = other.balance + amt;
	}
    }

    public String getName() {
	return name;
    }
}


