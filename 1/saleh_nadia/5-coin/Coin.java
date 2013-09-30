import java.io.*;
import java.util.*;

public class Coin {
    private String face; //will be "heads" or "tails"
    private int flips, heads, tails;
    private int fairness;

    public void resetCounts () {
	flips = 0;
	heads = 0;
	tails = 0;
    }
    
    public String  getFace () {
	return face;
    }
}
