import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String args[]){
<<<<<<< HEAD
	Coin c;
	c = new Coin();
	System.out.println(c.getFace());
=======
	Coin c, v;
	CoinPurse d;
	c = new Coin("dollar");
	System.out.println(c.getFace());
	c.flip();
	System.out.println(c.getFace());
	v = new Coin("dime");
	System.out.println(v.getValue());
	d = new CoinPurse();
	d.addTo(c);
	d.addTo(v);
	System.out.println(d.getAmount());
	
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
