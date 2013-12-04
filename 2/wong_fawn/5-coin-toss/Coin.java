import java.io.*;
import java.util.*;

public class Coin {
	private String face;
	private int counts, heads, tails;
	private double probability;

	public Coin() {
		face = "heads";
		counts = 0;
		heads = 0;
		tails = 0;
		probability = 0.0;
	}
	public void resetCounts(){
		counts = 0;
	}
	public String getFace(){
		return face;
	}
}