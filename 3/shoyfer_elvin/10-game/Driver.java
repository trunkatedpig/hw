import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		CoinGame game;
		game = new CoinGame(200);

		System.out.println("Testing turn...");
		game.turn();
		System.out.println("...End testing turn.");


		System.out.println("Testing game of 25 turns...");
		game.play(25);
		System.out.println("...End testing of game of 25 turns.");
	}
}
