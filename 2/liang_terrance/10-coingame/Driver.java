import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String Args[]){
	BankAccount player1, player2;
	CoinGame game;
	
	player1 = new BankAccount ("Tom");
	player2 = new BankAccount ("Billy");
	game = new CoinGame (player1, player2);
	
	System.out.println(game.status());
	game.turn();
	System.out.println(game.status());
	game.turn();
	System.out.println(game.status());
	game.play(4);
      	System.out.println(game.status());
	

    }
}
