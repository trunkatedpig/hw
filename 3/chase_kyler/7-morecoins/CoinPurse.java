import java.io.*;
import java.util.*;

public class CoinPurse {
	private double amount;

	public CoinPurse() {
		amount = 0.0;
	}

	public CoinPurse(double a) {
		amount = a;
	}

	public void addTo(Coin c) {
		double v;
		v = c.getValue();
		amount = amount + v;
	}

	public void removeFrom(Coin c) {
		double v;
		v = c.getValue();
		if (amount >= v) {
			amount = amount - v;}
		else {
			debtMessage(amount);}
	}

	public void debtMessage(double a) {
		String message;
		message = "You only have " + a + " in your coin purse.";
		System.out.println(message);
	}

	public double getAmount() {
		return amount;
	}



}

