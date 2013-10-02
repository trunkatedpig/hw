import java.io.*;
import java.util.*;

public class Coin {

	private String side;
	private int flips, heads, tails;
	private float fairness;
	private Random r = new Random();

	public void setHeads(int h){
		heads = h;
	}

	public void setTails(int t){
		tails = t;
	}	

	public void setFlips(int f){
		flips = f;
	}

	public void setFairness(int p){
		fairness = p;
	}
	
	public void Flip(){
		if (r.nextInt(2) == 1)
			{setHeads(heads + 1);
			setFlips(flips + 1);
			setFairness((heads/flips)*100);
			}
		else 	{setTails(tails + 1);
			setFlips(flips + 1);
			setFairness((heads/flips)*100);
			}
	}

	public void reset(){
		setFlips(0);
		setHeads(0);
		setTails(0);
		setFairness(0);}

	public float getFairness(){
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

} 
