import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int flips, fairness;


    public void reset() {
	flips = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips() {
	return flips;
    }
    
    public String flip() {
	flips += 1;
	return "Heads";
    }

}
