import java.io.*;
import java.util.*;

public class Coin{
	private int heads, tails, flips;
	private double odds;
	private String face;
	
<<<<<<< HEAD
=======
	public Coin(){
		odds = 50;
		heads = 0;
		tails = 0;
		flips = 0;
	}
>>>>>>> 72ef3c4b1f1e1095d28ea3debe7e1ab0ae7c5563
//Methods
	public void reset(){
		odds = 50;
		heads = 0;
		tails = 0;
		flips = 0;
		
	}

	public String getFace(){
		return face;
	}

<<<<<<< HEAD
=======
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

>>>>>>> 72ef3c4b1f1e1095d28ea3debe7e1ab0ae7c5563
}
