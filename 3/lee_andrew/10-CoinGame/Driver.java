import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	CoinGame g = new CoinGame();
	g.play(10);
	System.out.println("Player 1 has " +g.getMoney()+" dollars");
	System.out.println("Player 2 has "+g.getMoney2()+" dollars");
    }
}