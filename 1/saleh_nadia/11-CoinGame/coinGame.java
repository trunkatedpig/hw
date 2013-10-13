import java.io.*;
import java.util.*;

public class coinGame {
    private int pot;
    private BankAccount Jake, Nadia;
    private Coin X, Y;
    private Random R = new Random();

    public coinGame() {
	Jake.deposit(5000);
	Nadia.deposit(5000);
    }

    public void turn () {
	if (Jake.getBalance() > Nadia.getBalance()) {
	    int a = R.nexInt(Nadia.getBalance());
	}
	else {
	    int a = R.nextInt(Jake.getBalance());
	}	
	pot = pot + a + a;
	Nadia.withdraw(a);
	Jake.withdraw(a);		
	X.flip();
	Y.flip();
	if (X.getFace() == "Heads" && Y.getFace() == "Heads"){
	    Jake.deposit(pot);
	}
	else if (X.getFace() == "Tails
    
}