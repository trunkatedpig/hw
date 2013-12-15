import java.io.*;
import java.util.*;

public class CoinPurse {

    private double amount = 0;

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c) {
	amount = amount - c.getValue();
    }

    public double getAmount() {
	return amount;
    }

}
