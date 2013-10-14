import java.io.*;
import java.util.*;

public class CoinGame2 {
	public static void main(String[] args) throws InterruptedException {
	BankAccount player1 = new BankAccount("You", 00000000);
	BankAccount player2 = new BankAccount("Opponent", 88888888);
	player2.deposit(100);
	Coin c1 = new Coin();
	Coin c2 = new Coin();
		
	CoinGame game = new CoinGame(0, 1, player1, player2, c1, c2);
	Scanner input = new Scanner(System.in);
	System.out.println("Opponent's credit: " + player2.getBalance());
	System.out.println("Insert credit (int): ");
	
	player1.deposit(input.nextInt());
	
	while (player1.getBalance() > 0 && player2.getBalance() > 0) {
		System.out.println("");
		System.out.println("Your credit: " + player1.getBalance());
		System.out.println("Play? (type the number only)");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int choice = input.nextInt();
		
		
		if (choice == 1) {
			//play
			System.out.println("");
			System.out.println("How many times?");
			game.play(input.nextInt());
			System.out.println("");
		}
		if (choice == 2) {
			System.out.println("");
			System.out.println("You left the game.");
			break;
		}
		if (choice != 1 && choice != 2) {
			System.out.println("Invalid choice");
			System.out.println("");
			Thread.sleep(1000);
		}
	}
	
	}
}