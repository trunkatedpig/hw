import java.util.*;
import java.io.*;

public class Coin {

	private boolean face;
	private int head, tail, fair;

	public Coin() {
		fair = 50;
		head = 0;
		tail = 0;
	}

	public Coin(int i) {
		fair = i;
		head = 0;
		tail = 0;
	}

	public String flip() {
		Random r = new Random();
		if (fair > r.nextInt(100)) {
			head = head + 1;
			return "Heads";
		}
		else {
			tail = tail + 1;
			return "Tails";
		}
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
