import java.io.*;
import java.util.*;

public class CoinPurse {
    private int amount;

    public void addTo ( Coin c ) {
	amount += c.getValue();
    }

    public void removeFrom ( Coin c ) {
	amount -= c.getValue();
    }

    public int getAmount() {
	return amount;
    }
}
