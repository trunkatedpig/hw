import java.io.*;
import java.util.*;

public class Coin{
	private int heads, tails, flips;
	private double odds;
	private String face;
	
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

}
