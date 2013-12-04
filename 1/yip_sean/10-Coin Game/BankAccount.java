public class BankAccount {
	private int balance = 0;
	
	public BankAccount() {}
	
	public BankAccount(int balance) {this.balance = balance;}

	public int getBalance() {return balance;}
	
	public void deposit(int amount) {balance += amount;}
	
	public void withdraw(int amount) {if (balance >= amount) {balance -= amount;}}

	public void getMoneyFrom(BankAccount other, int amount) {
		if (other.balance >= amount) {
			other.balance -= amount;
			balance += amount;
		}
	}
	
	public void giveMoneyTo(BankAccount other, int amount) {
		if (balance >= amount) {
			balance -= amount;
			other.balance += amount;
		}
	}
}
