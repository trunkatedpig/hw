import java.util.*;
import java.io.*;

public class Coinpurse {
    private double amount;
    //Coin coins[];
    private ArrayList<Coin> coins = new ArrayList<Coin>();

    public Coinpurse() {
	amount = 0;
	//coins[] = new Coin[100];
    }

    public Coinpurse(double amount) {
	this.amount = amount;
	//coins[] = new Coin[100];
    }

    /*public Coinpurse(int numCoins) {
	amount = 0;
	coins[] = new Coin[numCoins];
    }*/

    public void addTo(Coin c) {
	amount += c.getValue();
	amount = Math.round(amount*100)/100.0; //Amount was something like
	                                       //0.01000000009 for some reason
	coins.add(c);
    }

    public void removeFrom(Coin c) {
	if (coins.contains(c)) {
	    coins.remove(c);
	    amount -= c.getValue();
	    amount = Math.round(amount*100)/100.0;
	}
	else
	    System.out.println("That coin is not in the coinpurse.");
    }

    public double getAmount() {
	return amount;
    }

    public ArrayList getCoins() {
	return coins;
    }

    public double[] getValues() {
	double values[] = new double[coins.size()];
	for (int i = 0; i<coins.size(); i++) {
	    values[i] = coins.get(i).getValue();
	}

	return values;
    }
}
