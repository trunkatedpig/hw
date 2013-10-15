import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		BankAccount acc1, acc2;
		acc1 = new BankAccount("Player 1", 1);
		acc2 = new BankAccount("Player 2", 2);
		acc1.deposit(1000);
		acc2.deposit(1000);
		CoinGame cg = new CoinGame(acc1, acc2);
		cg.turn();
		cg.play(20);
		System.out.println(cg.values());

	}
}

