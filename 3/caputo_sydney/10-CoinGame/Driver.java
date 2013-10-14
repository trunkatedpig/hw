import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	BankAccount p1 = new BankAccount("test1", 250);
	BankAccount p2 = new BankAccount("test2", 250);
	Coin c1 = new Coin();
	Coin c2 = new Coin();
	CoinGame letsRoll = new CoinGame(p1, p2, c1, c2);

	letsRoll.play(5);
    }
}
