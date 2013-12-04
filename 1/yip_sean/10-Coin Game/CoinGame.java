import java.util.*;

public class CoinGame {
	private BankAccount p1 = new BankAccount(100);
	private BankAccount p2 = new BankAccount(100);

	private Coin c1 = new Coin();
	private Coin c2 = new Coin();

	private int pot = 0;
	private Random r = new Random();

	public void turn() {
		int withdraw_amount = r.nextInt(100) + 1;
		pot += withdraw_amount;
		p1.withdraw(withdraw_amount);
		
		withdraw_amount = r.nextInt(100) + 1;
		pot += withdraw_amount;
		p2.withdraw(withdraw_amount);
		
		c1.flip();
		c2.flip();
		
		if (c1.getFace() && c2.getFace()) {
			p1.deposit(pot);
			pot = 0;
		}
		else if (!(c1.getFace()) && !(c2.getFace())) {
			p2.deposit(pot);
			pot = 0;
		}
	}
	
	public void play(int n) {
		while (n > 0) {
			turn();
			n--;
		}
	}
}