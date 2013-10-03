import java.io.*;
import java.util.*;


public class coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private int numHeads;
    
    public void reset() {
	flips = 0;
	heads = 0;
	tails = 0;
	numHeads = 0;
    }
    
    public String getFace(){
	return face;
    }
}
