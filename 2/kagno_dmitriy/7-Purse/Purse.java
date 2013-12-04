import java.util.*;

public class Purse{
    private int amount;
    public Purse(){
	amount = 0;
    }
    public Purse(Coin c){
	amount = c.getValue();
    }
    public void addTo(Coin c){
	amount = amount + c.getValue();
    }
    public void removeFrom(Coin c){
	if (amount > 0)
	    amount = amount - c.getValue();
    }
    public int getAmount(){
	return amount;
    }
}
