import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {
	BankAccount aBank = new BankAccount(100);
	BankAccount bBank = new BankAccount(100);
	Coin aCoin = new Coin();
	Coin bCoin = new Coin();

	CoinGame cGame = new CoinGame();
	cGame.setBank(aBank, bBank);
	cGame.setCoin(aCoin, bCoin);

	cGame.play(5);

	System.out.println(cGame.retPot());
	System.out.println(cGame.retOne());
	System.out.println(cGame.retTwo());
    }
}
