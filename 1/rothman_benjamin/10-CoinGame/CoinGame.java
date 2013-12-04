
import java.util.*;
import java.io.*;

public class CoinGame{

    private BankAccount bankaccount, bankaccount2;
    private Coin coin, coin2;
    private double pot;
    private double random;
    


    public  CoinGame (BankAccount bankaccount, Coin coin, BankAccount bankaccount2, Coin coin2) {
	this.coin = coin;
	this.coin2 = coin2;
	this.bankaccount = bankaccount;
	this.bankaccount2 = bankaccount2;

	    }




	public void turn () {


        if ((bankaccount.getBalance ()) < (bankaccount2.getBalance ()) ) {

	    random = ( (bankaccount.getBalance() ) * Math.random ());

	}

	else {

	    random = ( (bankaccount2.getBalance() ) * Math.random () );

	}

    
        this.bankaccount.withdraw (random);
	this.bankaccount2.withdraw (random);
	pot = pot + (2 * random);

	coin.flip ();
	coin2.flip ();

	if (coin.getFace () .equals ( coin2.getFace () )  && coin.getFace ()  .equals ("Heads")) { 

	   this.bankaccount.deposit (pot);
	    pot = 0;

		}

	else {

	    if ( coin.getFace () .equals ( coin2.getFace () ) && coin.getFace () .equals ("Tails")) {

		this.bankaccount2.deposit (pot);
		pot = 0;

	    }

	}

	}


    public void play (int n) {

	while (n > 0) {


	    turn ();
	    n = n -1;

	}

    }



    public double getBankAccount () {

return bankaccount.getBalance ();

    }


    public double getBankAccount2 () {

	return bankaccount2.getBalance ();

    }

}





