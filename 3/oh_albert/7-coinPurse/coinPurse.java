import java.io.*;
import java.util.*;

public class coinPurse {

    private int amount = 150, coinval;
    private String coinname;

    public coinPurse (String name, int val) {
	coinval = val;
	coinname = name;
	Coin c;
	c = new Coin (name,val);
    }
    
    public int addTo (Coin c) {
	amount = amount + c.money();
	return amount;
    }

    public int removeFrom (Coin c) {
	amount = amount - c.money();
	return amount;
    }

}
