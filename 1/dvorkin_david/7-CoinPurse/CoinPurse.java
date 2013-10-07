import java.io.*;
import java.util.*;

public class CoinPurse {

    private int amount;

    public CoinPurse (int amount){
	this.amount = amount;
    }

    public int addTo(Coin c){
	amount = amount + c.getValue();
	return amount;
	    }

    public int removeFrom(Coin c){
	amount = amount - c.getValue();
	return amount;
	    }

    public int getAmount(){
	return amount;
    }
}
