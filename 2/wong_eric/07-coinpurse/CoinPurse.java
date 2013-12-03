import java.io.*;
import java.util.*;

public class CoinPurse {

    private int amount = 0;
    private int coins = 0;

    public void addTo(Coin c) {
	amount = amount + c.getValue();
	coins = coins + 1;
    }
    public void removeFrom(Coin c) {
	amount = amount - c.getValue();
	coins = coins - 1;
    }

    public int getMoney() {
	return amount;
    }
    public int getCoin() {
	return coins;
    }

}