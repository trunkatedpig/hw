import java.util.*;
import java.io.*;

public class Coin {
    public String face;
    public int count;
    public int flips;
    public int prob;

    
    public Coin() {
	setCount(0);
	setFlips(0);
	prob = 0.5;
    }
    

    public void setCount(int n) {
	count = n;
    }

    public void setFlips(int n) {
	count = n;
    }


    public void resetCount() {
	setCount(0);
    }

    public String getFace() {
	return face;
    }

    public String flip() {
	Random r = new Random();
	int a = r.nextint(2);
	if (a == 1)
	    setCount(count +1);
	////////////
	    return "Head";
	else
	    return "Tail";
	
    }
}
