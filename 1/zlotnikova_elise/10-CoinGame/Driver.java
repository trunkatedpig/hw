import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	CoinGame game;
	game = new CoinGame();
	game.turn();
	System.out.println(game.getPot());
	System.out.println(game.getBalances());
	System.out.println(game.winner());
    }
}
