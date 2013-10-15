import java.math.*;

public class CoinGame{

    private BankAccount b1, b2;
    private Coin c1, c2;
    private double pot;

    public CoinGame(){
	b1 = new BankAccount("Player 1", 1);
	b2 = new BankAccount("Player 2", 2);
	c1 = new Coin();
	c2 = new Coin();
	pot = 0;
    }

    public void turn(){
	double balance, taken;
	
	if (b1.getBalance() > b2.getBalance())
	    balance = b2.getBalance();
	else
	    balance = b1.getBalance();
	
	taken = Math.random() * balance;
	pot = pot + (taken * 2);

	b1.withdraw(taken);
	b2.withdraw(taken);

	c1.flip();
	c2.flip();

	if (c1.equals(c2)){
		if (c1.getFace().equals("Heads")){
		    b1.deposit(pot);
		    pot = 0;
		}
		if (c1.getFace().equals("Tails")){
		    b2.deposit(pot);
		    pot = 0;
		}
	}
    }
    
    public void play(int n){
	
	while (n > 0){
	    turn();
	    n = n - 1;
	}
    }

    public BankAccount getBankAccount1(){
	return b1;
    }

    public BankAccount getBankAccount2(){
	return b2;
    }


}
