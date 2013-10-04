import java.util.*;
import java.io.*;

public class Coin {

	private boolean face;
	private int head, tail
	private double fair;

	public Coin() {
		fair = .5;
		head = 0;
		tail = 0;
		face = true;
	}

	public Coin(double i) {
		fair = i;
		head = 0;
		tail = 0;
		face = true;
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

	public int getFlips() {
		return head + tail;
	}

	public void resetFlips() {
		head = 0;
		tail = 0;
	}
}
