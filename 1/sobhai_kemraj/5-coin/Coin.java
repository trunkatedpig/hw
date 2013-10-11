import java.io.*;
import java.util.*;

public class Coin{
	private int heads, tails, flips;
	private double odds amount;
	private String face, type;
	

	public Coin(){
		odds = 50;
		heads = 0;
		tails = 0;
		flips = 0;
		amount = 0.25;
		type = "Quarter";
	}

	public Coin(int stats, double value){
		odds = stats;
		heads = 0;
		tails = 0;
		flips = 0;
		amount = value;
		/*if (amount == 0.25)
			type = "Quarter";
		else if (amount == */
	}

//Methods
	public void reset(){
		odds = 50;
		heads = 0;
		tails = 0;
		flips = 0;
		amount = 0.25;
	}

	public void resetStats(int stats){
		odds = stats;
		heads = 0;
		tails = 0;
		flips = 0;
		amount = 0.25;
	}

	public String getFace(){
		return face;
	}

	public void flip(){
		if (Math.random() * 100<odds){
			heads += 1;
			flips += 1;
			face ="heads";
		}
		else {
			tails+= 1;
			flips += 1;
			face = "tails";
		}
	}
}
