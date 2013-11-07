import java.io.*;
import java.util.*;

public class Coin {

    private String face, coinName;
    private int heads,tails,flips;
    private double random,probability,coinValue;

    public Coin(String coinValue){
	flips = 0;
	heads = 0;
	tails = 0;
	probability = 0.5;
    }

    public double Coin (String coinName){
	if (coinName == "quarter"){
	    coinValue = .25;
	}
	if (coinName == "dime"){
		coinValue = .10;
	}
	if (coinName == "nickel"){
	    coinValue = .05; 
	}
	if (coinName == "penny"){
	    coinValue =.01;
	}
	return coinValue;
    }

    public void resetCount(){
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public void flip(){
	random = Math.random();
	flips = flips + 1;
	if (random > probability){
	    face = "heads";
	    heads = heads + 1;
	}else 
	    {
		face = "tails";
		tails = tails + 1;
	    }
    }

    public String getFace(){
	return face;
    }
    public double getValue(){
	return coinValue;
    }

}
