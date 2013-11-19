<<<<<<< HEAD
import java.io.*;
import java.util.*;



public class Coin {

    public String face;
    public int flips,heads,tails;
    public double fairness;

   
    
    public void resetCounter() {
	flips = 0;
	//Do you also need to reset heads and tails or just flips?
	heads = 0;
	tails = 0;
    }
    
    public String getface() {
	return face;
    }
	   
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
