import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int outcomeHeads, outcomeTails, fairness;
    
    public void resetCount(){
	outcomeHeads=0;
	outcomeTails=0;
    }
    public String getFace(){
	return face;
    }
}