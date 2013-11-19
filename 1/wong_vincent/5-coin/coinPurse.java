import java.io.*;
import java.util.*;

public class coinPurse {
    private int amount;
    // private Coin c;

    public coinPurse() {
	amount = 100;
    }

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom (Coin c) {
	amount = amount - c.getValue();
    }

    public int getAmount() {
	return amount;
    }
}

