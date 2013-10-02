import java.util.*;
import java.io.*;

public class Coin {
    public String face;
    public int tosses;
    public int heads;
    public double prob;

    
    public Coin() {
        initCoin("Heads", 0.5);
    }
    
    public void initCoin(String f, double p) {
	setFace(f);
	tosses = 0;
	heads = 0;
	setProb(p);
    }
    public void setFace(String f) {
	face = f;
    }

    public void setProb(double p) {
	prob = p;
    }


    public void resetCount() {
	tosses = 0;
    }

    public String getFace() {
	return face;
    }
    /*
    public String flip() {
	Random r = new Random();
	int a = r.nextint(2);
	if (a == 1)
	    setTosses(tosses +1);
	////////////
	    return "Head";
	else
	    return "Tail";
	    }
    */
}
