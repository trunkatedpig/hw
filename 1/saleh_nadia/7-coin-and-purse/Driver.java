import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Coin Q = new Coin ("quarter");
	System.out.println (Q.getValue());
	System.out.println (Q.getFace());
	System.out.println (Q.flip());
	System.out.println (Q.flip());
	
	CoinPurse P = new CoinPurse ();

	Coin Q1 = new Coin ("quarter");
	Coin p = new Coin ("penny");
	Coin n = new Coin ("nickel");
	Coin d = new Coin ("dime");
	Coin p2 = new Coin ("penny");
	P.addTo(Q);
	P.addTo (Q1);
	P.addTo (p);
	P.addTo (n);
	P.addTo (d);
	P.addTo (p2);

	System.out.println (P.getAmount());
    }
}
