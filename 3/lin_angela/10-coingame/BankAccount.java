public class BankAccount {
    private int balance;
    private String name;
    private int acctnumber;

    public BankAccount(int balance) {
	this.balance = balance;
    }
    

    public void deposit(int amt) {
	balance = balance + amt;
    }

    public void withdraw(int amt) {
	// this if is important
	if (balance >= amt) {
	    balance = balance - amt;
	}
    }

    public int getBalance() {
	return balance;
    }

    /* public void takeMoneyFrom(BankAccount other, double amt) {
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
    */
}
