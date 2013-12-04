
import java.util.*;
import java.io.*;

public class Driver {

    public static void main (String [] args ) {

	CoinGame cg = new CoinGame (new BankAccount ("Tom", 5.50 ), new Coin ("Quarter", 0.25), new BankAccount ("Jane", 7.73), new Coin ("Penny", 0.01) );

	CoinGame cg2 = new CoinGame (new BankAccount ("Tom", 5.50 ), new Coin ("Quarter", 0.25), new BankAccount ("Jane", 7.73), new Coin ("Penny", 0.01) );

	CoinGame cg3 = new CoinGame (new BankAccount ("Tom", 5.50 ), new Coin ("Quarter", 0.25), new BankAccount ("Jane", 7.73), new Coin ("Penny", 0.01) );

	CoinGame cg4 = new CoinGame (new BankAccount ("Tom", 5.50 ), new Coin ("Quarter", 0.25), new BankAccount ("Jane", 7.73), new Coin ("Penny", 0.01) );



	cg.turn ();

	System.out.println ("PLAYING A SINGLE TURN");

	System.out.println (cg.getBankAccount () );
	System.out.println (cg.getBankAccount2 () );

	System.out.println ("------------------");



	cg2.play (5);

	System.out.println ("PLAYING 5 TURNS");

	System.out.println (cg2.getBankAccount () );
	System.out.println (cg2.getBankAccount2 () );

	System.out.println ("------------------");

	cg3.play (30);

	System.out.println ("PLAYING 30 TURNS");

	System.out.println (cg3.getBankAccount () );
	System.out.println (cg3.getBankAccount2 () );

	System.out.println ("-------------------");

	cg4.play (0);

	System.out.println ("PLAYING 0 TURNS. THIS SHOULD JUST RETURN THE VALUES THAT WE INITIATED THE BANK ACCOUNTS WITH");

	System.out.println (cg4.getBankAccount () );
	System.out.println (cg4.getBankAccount2 () );

    }

}
