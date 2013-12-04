import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private double chance;
    private int val;
    private String name;
    public Coin(String f, double c,String n, int v  ) {
	flips=0;
	face=f;
	heads=0;
	chance= c;
	name=n;
	val=v;
    }
    public Coin( int v, String n) {
        flips=0;
        face="Heads";
        heads=0;
        chance= .5;
        name=n;
	val=v;
    }

    public Coin(String f ) {
	flips=0;
	face=f;
	heads=0;
	chance= .5;
	val=25;
	name="quarter";
    } 
    public Coin() {
	flips=0;
	face="Heads";
	heads=0;
	chance= .5;
	name="quarter";
	val=25;
    }

    
    public void setCount() {
	flips=0;
	heads=0;
    }
    public String getFace() {
	return face;
	    }
    public int getFlips() {
	return flips;
    }
    public int getVal() {
	return val;
    }
    public boolean equals(Coin o) {
        return face.equals(o.getFace());
    }
    public String flipCoin() {
	Random r= new Random();
	double g=r.nextDouble();
	g=g*chance;
	if (g >= .25){
	    heads= heads+1;
	    face = "Heads";
	}
	else 
	    face="Tails";
	flips=flips+1;
	return face;
    }
}
