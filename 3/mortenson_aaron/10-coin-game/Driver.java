import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String args[]) {
	BankAccount ba1, ba2;
	CoinGame game;
	ba1 = new BankAccount("player1", 1);
	ba2 = new BankAccount("player2", 2);
	ba1.deposit(10);
	ba2.deposit(10);
	game = new CoinGame (ba1, ba2);
	System.out.println(game.status());
	game.turn();
	System.out.println(game.status());
	game.play(5);
	System.out.println(game.status());
    }
} 