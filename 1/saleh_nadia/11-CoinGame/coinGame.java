import java.io.*;
import java.util.*;

public class coinGame {
    private int pot;
    private BankAccount Jake = new BankAccount ("Jake", 5000);
    private BankAccount Nadia = new BankAccount ("Nadia",5000);
    private Coin X = new Coin ();
    private Coin Y = new Coin ();
    private Random R = new Random();

    public coinGame() {
	Jake.deposit(5000);
	Nadia.deposit(5000);
    }

    public void  turn () {
	int a = 0;
	if (Jake.getBalance() > Nadia.getBalance()) {
	    a = R.nextInt((int)(Nadia.getBalance()));
	}
	else {
	    a = R.nextInt((int)(Jake.getBalance()));
	}	
	pot = pot + a + a;
	Nadia.withdraw(a);
	Jake.withdraw(a);
	X.flip();
	Y.flip();
	if (X.getFace() == "Heads" && Y.getFace() == "Heads"){
	    Jake.deposit(pot);
	}
	else if (X.getFace() == "Tails" && Y.getFace() == "Tails"){
	    Nadia.deposit(pot);
	}
    }

    public String getFaces () {
	return X.getFace () + "\n" + Y.getFace ();
    }

    public String getBalances () {
	return "Jake: " + Jake.getBalance() + "\nNadia: " + Nadia.getBalance ();
    }

    public int getPot () {
	return pot;
    }
}
