import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
<<<<<<< HEAD
	Coin c1;
	c1 = new Coin();
=======
	Coin c1, c2;
	CoinPurse cp1;
	c1 = new Coin();
	c2 = new Coin(25, "quarter");
	cp1= new CoinPurse();
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	System.out.println(c1.getFlips());
	c1.setCount();
	System.out.println(c1.getFlips());
	System.out.println(c1.getFace());
<<<<<<< HEAD
=======
	System.out.println(c1.flipCoin());
	cp1.addTo(c2);
	System.out.println(cp1.getAmount());
	cp1.removeFrom(c2);
	System.out.println(cp1.getAmount());

	
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

    }
}