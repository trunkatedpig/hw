import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main(String[] arg) {
	BankAccount p1, p2;
	p1 = new BankAccount("Player 1", 1000);
	p2 = new BankAccount("Player 2", 1000);

	Coin c1, c2;
	c1 = new Coin();
	c2 = new Coin();

	CoinGame game;
	game = new CoinGame(p1,p2,c1,c2);

	System.out.println(p1.getName() + " has $" + p1.getBalance());
        System.out.println(p2.getName() + " has $" + p2.getBalance());
        System.out.println("Money left in pot: " + game.getPot());
    }
}
