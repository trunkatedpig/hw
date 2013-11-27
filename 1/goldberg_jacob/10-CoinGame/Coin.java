import java.io.*;
import java.util.*;

public class Coin {

	private String side, name;
	private int flips, heads, tails;
	private double fairness, worth;
	private Random r = new Random();
	
	public Coin(double p, double ammount, String n){
		setFairness(p);
		setHeads(0);
		setTails(0);
		setFlips(0);
		setWorth(ammount);
		setName(n);
	}

	public Coin(){
		setFairness(.5);
		setHeads(0);
		setTails(0);
		setFlips(0);
		setWorth(.25);
		setName("Quarter");
	}

	public void setName(String n){
		name = n;
	}

	public void setHeads(int h){
		heads = h;
	}

	public void setWorth(double ammount){
		worth = ammount;
	}

	public void setTails(int t){
		tails = t;
	}	

	public void setFlips(int f){
		flips = f;
	}

	public void setFairness(double p){
		fairness = p;
	}
	
	public String Flip(){
		if ((Math.round(Math.random()-.5+fairness))==1)
			{setHeads(heads + 1);
			setFlips(flips + 1);
			side = "Heads";
			return side;
			}
		else 	{setTails(tails + 1);
			setFlips(flips + 1);
			side = "Tails";
			return side;
			}
	}

	public void reset(){
		setFlips(0);
		setHeads(0);
		setTails(0);
		setFairness(0);}

	public double getFairness(){
		return fairness;
	}

	public int getTails(){
		return tails;
	}

	public int getFlips(){
		return flips;
	}

	public int getHeads(){
		return heads;
	}

	public String getName(){
		return name;
	}

	public double getAmmount(){
		return worth;
	}	

} 
