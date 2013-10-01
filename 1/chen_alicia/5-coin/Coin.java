import java.io.*;
import java.util.*;

public class Coin {
    private String face; //"heads" or "tails"
    private int flips, heads, tails;
    private int fairness; //percent of heads

    public void resetCounts(){
	flips = 0;
	heads = 0;
	tails = 0;
    }
    
    public String getFace() {
	return face;
    }

}
