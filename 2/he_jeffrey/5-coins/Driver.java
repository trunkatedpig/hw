// worked with mindi cao

import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String args[]){
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
	
    }
}
