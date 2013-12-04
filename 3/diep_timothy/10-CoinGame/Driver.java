import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	CoinGame c;
	c = new CoinGame("Tim", "Mike");
	
	System.out.println("One Round:");
	c.play(1);
	c.ScoreCheck();
	System.out.println();
	System.out.println();
	System.out.println("Five Rounds:");
	System.out.println();
	c.play(5);
	c.ScoreCheck();
    }
}
