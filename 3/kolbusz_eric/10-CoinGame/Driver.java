import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) { 
	CoinGame g;
	Coin c1,c2;
	BankAccount p1,p2;
	
	p1 = new BankAccount(50);
	p2 = new BankAccount(50);

	g = new CoinGame(p1,p2);

	System.out.println(g.getBalance(p1));
	System.out.println(g.getBalance(p2));
	System.out.println(g.getPot());

	g.turn();

	System.out.println(g.getBalance(p1));
	System.out.println(g.getBalance(p2));
	System.out.println(g.getPot());	

	g.play(15);

	System.out.println(g.getBalance(p1));
	System.out.println(g.getBalance(p2));
	System.out.println(g.getPot());		
    }
}
