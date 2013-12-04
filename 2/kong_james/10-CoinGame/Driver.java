import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args){
	CoinGame game;
	BankAccount a,b;

	a = new BankAccount("Bob",1);
	b = new BankAccount("Bobby",2);
	game = new CoinGame(a,b);
	
	game.turn();
	System.out.println(game.getWinner());
	game.turn();
	System.out.println(game.getWinner());
	game.turn();
	System.out.println(game.getWinner());
	game.play(10);
	System.out.println(game.getWinner());
    }
}
