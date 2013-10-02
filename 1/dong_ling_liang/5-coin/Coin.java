import java.io.*;
import java.util.*;

public class Coin{
   
    private String face;
    private int flips, heads, fairness;

    public void reset(){
        flips=0;
	heads=0;
	fairness=0;
	    }

    public String currentFace(){
	return face;
    }
}