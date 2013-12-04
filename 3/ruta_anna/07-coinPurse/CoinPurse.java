import java.io.*;
import java.util.*;

public class CoinPurse {

/* Instance variable amount gives the total value of all coins in the purse */

	private double amount;

/* Creation of constructor that can call the Coin class */

	public CoinPurse() {
		amount = 0;
	}

	public CoinPurse(double v) {
		amount = v;
	}

/* A method that adds a coin to the purse by adding the coin's value to the purse */

	public void addTo(Coin c) {
		amount = amount + c.getCoinValue();
	}

/* A method that removes a coin from the purse by subtracting the coin's value from the purse amount */

	public void removeFrom(Coin c) {
		amount = amount - c.getCoinValue();
	}

/* Set basic get method */

	public double getPurseAmount() {
		return amount;
	}
}