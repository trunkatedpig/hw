import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Coin head1 = new Coin();
	Coin tail1 = new Coin("Tails");
        System.out.println(head1.getFace());
	System.out.println(tail1.getFace());
	Coin head2 = new Coin("Nickel",5);
	Coin head3 = new Coin("Quarter",25);
	coinPurse quarter = new coinPurse ("Quarter",25);
	coinPurse dime = new coinPurse ("Dime",10);
	System.out.println(quarter.addTo(head2));
	System.out.println(dime.removeFrom(head3));
    }
}
