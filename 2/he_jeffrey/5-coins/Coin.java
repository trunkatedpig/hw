import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips,heads,tails,headProb;
    public Coin() {
	face = "Heads";
	
    }
    public void resetCount() {
	flips = 0;
    }
   
    public String getFace() {
	return face;
    }
}
