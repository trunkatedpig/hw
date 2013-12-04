import java.io.*;
import java.util.*;

public class Driver {
	public static void main (String args[]) {
		CoinGame game = new CoinGame(1000, 200);
		game.play(20);
	}
}