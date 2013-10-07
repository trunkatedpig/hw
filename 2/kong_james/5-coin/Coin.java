import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int hcount,tcount,flipcount;
    private double fairness,h,r;

    public Coin(){
	fairness = 0;
	hcount = 0;
	tcount = 0;
	flipcount = 0;
    }
    public void flip(){
	r = Math.random();
	h = .50;
	
	if (r > h)
	    {
		face = "heads";
		hcount = hcount + 1;
		flipcount = flipcount + 1;
	    }
	else
	    { 
		face = "tails";
		tcount = tcount + 1;
		flipcount = flipcount +1;
	    }
    }
  
    public void reset(){
	hcount = 0;
	tcount = 0;
	fairness = 0;
    }
    public String getFace(){
	return face;
    }
    public int getFlipcount(){
	return flipcount;
    }
}
