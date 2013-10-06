import java.io.*;
import java.util.*;

public class CoinPurse {

    private double amount;
    private int coins,pennies,nickels,dimes,quarters;

    public CoinPurse() {
	amount = 0;
	coins = 0;
	pennies = nickels = dimes = quarters = 0;
    }

    public void addTo(Coin c) {
	amount += c.getValue();
	coins += 1;
	if (c.getName() == "penny") {
	    pennies += 1;
	}
	else if (c.getName() == "nickel") {
	    nickels += 1;
	}
	else if (c.getName() == "dime") {
	    dimes += 1;
	}
	else if (c.getName() == "quarter") {
	    quarters += 1;
	}
    }

    public void removeFrom(Coin c) {
	amount -= c.getValue();
	coins -= 1;
	if (c.getName() == "penny") {
	    pennies -= 1;
	}
	else if (c.getName() == "nickel") {
	    nickels -= 1;
	}
	else if (c.getName() == "dime") {
	    dimes -= 1;
	}
	else if (c.getName() == "quarter") {
	    quarters -= 1;
	}
    }
    public String getAmount() {
	return "Total amount in purse: " +  amount;
    }
    public String getCoins() {
	return "Number of coins: " + coins + "\n"
	    + "Number of pennies: " + pennies + "\n"
	    + "Number of nickels: " + nickels + "\n"
	    + "Number of dimes: " + dimes + "\n"
	    + "Number of quarters: " + quarters + "\n";
    }
}
