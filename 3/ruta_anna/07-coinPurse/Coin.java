import java.io.*;
import java.util.*;

public class Coin {

	private String coinName;
	private double coinValue;

/* Creation of constructor that can call the Coin class */

	public Coin(String n, double v) {
		coinName = n;
		coinValue = v;
	}

	public Coin(String n) {
		setCoinValue(n);
	}

	public Coin(double v) {
		setCoinName(v);
	}

/* Sets the coin name based on a given coin value*/

	public void setCoinName(double v) {
		coinValue = v;
		if (v == 0.25) {
			coinName = "quarter";
			}
		else if (v == 0.10) {
			coinName = "dime";
			}
		else if (v == 0.05) {
			coinName = "nickel";
			}
		else if (v == 0.01) {
			coinName = "penny";
			}
		else {
			coinName = "unknown";
			}
	}

/* Sets coin value based on a given coin name */

	public void setCoinValue(String n) {
		coinName = n;
		if (n == "quarter") {
				coinValue = 0.25;
				}
			else if (n == "dime") {
				coinValue = 0.10;
				}
			else if (n == "nickel") {
				coinValue = 0.05;
				}
			else if (n == "penny") {
				coinValue = 0.01;
				}
			else {
				coinValue = 0;
				}
	}


/* Set basic get methods */

	public String getCoinName() {
		return coinName;
	}

	public double getCoinValue() {
		return coinValue;
	}

}