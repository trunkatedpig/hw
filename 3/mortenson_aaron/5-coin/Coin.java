import java.util.*;
import java.io.*;

public class Coin {

	private boolean face;
	private int head, tail, fair;

	public Coin() {
		fair = 50;
		head = 0;
		tail = 0;
		face = true;
	}

	public Coin(int i) {
		fair = i;
		head = 0;
		tail = 0;
		face = true;
	}

	public void flip() {
		Random r = new Random();
		if (fair > r.nextInt(100)) {
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
