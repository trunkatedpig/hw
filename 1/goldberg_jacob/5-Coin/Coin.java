import java.io.*;
import java.util.*;

public class Coin {

	private String side;
	private int flips, heads, tails, fairness;

	public void reseter(){
		flips = 0;
		heads = 0;
		tails = 0;
		fairness = 0;}

	public String getSide(){
		return side;
	}
} 
