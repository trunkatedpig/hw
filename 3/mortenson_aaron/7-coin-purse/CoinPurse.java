import java.util.*;
import java.io.*;

public class CoinPurse {

	private int amount;

	public CoinPurse() {
		amount = 0;
	}

	public CoinPurse(int i) {
		amount = i;
	}

	public void addTo(Coin c) {
		amount = amount + c.getValue();
	}

	public void removeFrom(Coin c) {
		amount = amount - c.getValue();
	}

	public int getAmount() {
		return amount;
	}

}
