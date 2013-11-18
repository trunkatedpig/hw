import java.io.*;
import java.util.*;

public class Coin {
    private String face;
<<<<<<< HEAD
    private int hcount;
    private int tcount;
    private int fairness;

    public void perctHead(){
	fairness = hcount / (hcount + tcount);
=======
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
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
  
    public void reset(){
	hcount = 0;
	tcount = 0;
	fairness = 0;
    }
    public String getFace(){
	return face;
    }
<<<<<<< HEAD
=======
    public int getFlipcount(){
	return flipcount;
    }
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
