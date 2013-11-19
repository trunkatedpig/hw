import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int fairness;

    public void setFlips(int n) {
	flips = n;
    }

    public void reset() {
	setFlips(0);
    }

    public String getFace() {
	return face;
    }

    public void setFace(String f) {
	face = f;
    }
    
    public int getFlips() {
	return flips;
    }

}
