import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	BankAccount p1,p2;
	Coin c1,c2;
	CoinGame cg;

	p1 = new BankAccount("Bob",39586);
	p2 = new BankAccount("Joe",96729);
	c1 = new Coin();
	c2 = new Coin();
	cg = new CoinGame(p1,p2,c1,c2);

	p1.deposit(150.00);
	p2.deposit(200.00);
	System.out.println("At the start of the game: \n" + cg.currentValues() + "\n");
	cg.initPot();
	System.out.println("Let's start the game: \n" +  cg.currentValues() + "\n");
	cg.turn();
	System.out.println("Turn number: " + cg.getTurn());
	System.out.println(cg.currentValues() + "\n");
        cg.play(10);
	System.out.println("Turn number: " + cg.getTurn());
	System.out.println(cg.currentValues());
	System.out.println(cg.announceWinner());
    }

}
