import java.util.*;
import java.io.*;

public class Coin {

	private String type;
	private boolean face;
	private int head, tail, value;
	private double fair;

	public void makeCoin(double a, String b, int c) {
		fair = a;
		head = 0;
		tail = 0;
		face = true;
		type = b;
		value = c;
	}

	public Coin() {
		makeCoin(.5, "Penny", 1);
	}

	public Coin(double i) {
		makeCoin(i, "Penny", 1);
	}

	public Coin(double a, String b, int c) {
		makeCoin(a, b, c);
	}

	public Coin(String name) {
		
		if (name == "Penny" || name == "penny" )
			makeCoin(.5, "Penny", 1);
		else if (name == "Nickel" || name == "nickel" )
			makeCoin(.5, "Nickel", 5);
		else if (name == "Dime" || name == "dime" )
			makeCoin(.5, "Dime", 10);
		else if (name == "Quarter" || name == "quarter" )
			makeCoin(.5, "Quarter", 25);
		else if (name == "Harvey")
			makeCoin(1, "Harvey", 100);
		else
			makeCoin(.5, name, 1);
	}

	public void flip() {
		if (fair > Math.random()) {
			face = true;
			head = head + 1;
		}
		else {
			face = false;
			tail = tail + 1;
		}
	}

	public String getFace() {
		if (face == true) 
			return "Heads";
		else
			return "Tails";
	}
	
	public int getHeads() {
		return head;
	}

	public int getTails() {
		return tail;
	}

	public int getValue() {
		return value;
	}

	public int getFlips() {
		return head + tail;
	}

	public void resetFlips() {
		head = 0;
		tail = 0;
	}
}
