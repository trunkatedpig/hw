import java.io.*;
import java.util.*;

public class Coin {
    private String name;
    private String face;
    private int hcount;
    private int tcount;
    private int flipcount;
    private double chance;
    private double fairness;
    private double h;
    private double r;
    private int value;

    public Coin(String n, int v){
	n = name;
	v = value;
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
    public double perctHead(){
	fairness = (hcount) / (flipcount);
	return fairness;
    }
  
    public void reset(){
	hcount = 0;
	tcount = 0;
	fairness = 0;
    }
    public String getFace(){
	return face;
    }
}
