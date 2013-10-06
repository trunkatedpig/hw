import java.io.*;
import java.util.*;

public class Coinpurse {

    private double amount;

    public Coinpurse() {
	amount = 0.0;
    }

    public Coinpurse(double a) {
	amount = a;
    }

    public double addTo(Coin2 c) {
	double w;
	w = c.getValue();
	amount += w;
	return amount;
    }

    public void removeFrom(Coin2 c) {
	double w;
	w = c.getValue();
	if (amount >= w) {
	    amount -= w;
	}
	else {
	    YoureBroke(amount);
	}
    }

    public void YoureBroke(double money) {
	String message;
	message =  "Sorry, but you only have $" + money + " in your coin purse.";
	System.out.println(message);
    }

    public double getAmount() {
	return amount;
    }
}


