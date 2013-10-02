import java.io.*;
import java.util.*;

public class Coin{
	private int heads, tails, flips;
	private double odds;
	private String face;
	

	public Coin(){
		odds = 50;
		heads = 0;
		tails = 0;
		flips = 0;
	}

	public Coin(int stats){
		odds = stats;
		heads = 0;
		tails = 0;
		flips = 0;
	}

//Methods
	public void reset(){
		odds = 50;
		heads = 0;
		tails = 0;
		flips = 0;
		
	}

	public void resetStats(int stats){
		odds = stats;
		heads = 0;
		tails = 0;
		flips = 0;
		
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
