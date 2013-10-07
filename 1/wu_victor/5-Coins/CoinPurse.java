import java.io.*;
import java.util.*;

public class CoinPurse {
    // Instance Variables

    private int amount;
    private Coin c;

    // Constructors

    public CoinPurse () {
	amount = 0;
    }

    // addTo

    public void addTo (Coin c) {
	int a;
	a = c.getV();
	amount = amount + a;
    }

    // removeFrom

    public void removeFrom (Coin c) {
	int b;
	b = c.getV();
	amount = amount - b;
    }

    // Helper Functions

    public void setC (Coin k) {
	k = c;
    }

    // Return Methods

    public int getAmount () {
	return amount;
    }

}
