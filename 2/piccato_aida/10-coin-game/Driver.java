import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String args[]) {
	CoinGame game = new CoinGame();
	//System.out.println(game.getPot());
	/*game.setPot();
	System.out.println(game.getBankAccounts());
	System.out.println(game.getPot());
	game.turn();
	System.out.println(game.a.getFace());
	System.out.println(game.b.getFace());
	System.out.println(game.getBankAccounts());
	System.out.println(game.getPot());
	game.turn();
	System.out.println(game.a.getFace());
	System.out.println(game.b.getFace());
	System.out.println(game.getBankAccounts());
	System.out.println(game.getPot());*/
	System.out.println(game.getBankAccounts());
	game.play(2);
	System.out.println(game.getBankAccounts());
	game.play(10);
	System.out.println(game.getBankAccounts());
    }
}
