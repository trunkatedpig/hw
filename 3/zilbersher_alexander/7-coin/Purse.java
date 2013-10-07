import java.io.*;
import java.util.*;

//Create Purse class                                                             
public class Purse {
    
    //create variables
    private int amount;

    //create base purse
    public Purse() {
	amount = 0;
    }
    
    //create function to add and subtract value to purse
    //(can call on getValue from Coin class)
    public void addTo(Coin c) {
	amount += c.getValue();
    }

    public void addTo(Coin c, int i) {
	amount += (c.getValue()*i);
    }
    
    public void removeFrom(Coin c) {
	amount -= c.getValue();
    }
    
    public void removeFrom(Coin c, int i) {
	amount -= (c.getValue()*i);
    }

    public int getAmount() {
	return amount;
    }

    public void reset() {
	amount = 0;
    }
}

