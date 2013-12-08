import java.util.*;
import java.io.*;

public class CoinPurse {
    private double amount = 0;

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c) {
	if (c.getValue() > amount)
	    System.out.println("You do not have that kind of money fool");
	else
	    amount = amount - c.getValue();
    }

    public double getAmount() {
	return amount;
    }
    


}
