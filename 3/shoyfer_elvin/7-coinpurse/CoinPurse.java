import java.io.*;
import java.util.*;

public class CoinPurse {
	private int amount;

	public CoinPurse() {
		setAmount(0);
	}

	public CoinPurse(int a) {
		setAmount(a);
	}

	// sets

	public void setAmount(int a) {
		amount = a;
	}

	// gets

	public int getAmount() {
		return amount;
	}

	// methods

	public void addTo(Coin c) {
		int addition = c.getValue();
		int current = getAmount();
		setAmount(current + addition);
	}

	public void removeFrom(Coin c) {
		int subtraction = c.getValue();
		int current = getAmount();
		setAmount(current - subtraction);
	}
}