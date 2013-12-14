import java.io.*;
import java.util.*;

public class Coin {
    private String face,name;
    private int hcount,tcount,flipcount;
    private double fairness,h,r,value;

    public Coin(){
	name = "Penny";
	value = .01;
	fairness = 0;
	hcount = 0;
	tcount = 0;
	flipcount = 0;
    }
    public Coin(String n, Double v){
	name = n;
	value = v;
	fairness = 0;
	hcount = 0;
	tcount = 0;
	flipcount = 0;
    }
    public Coin(Double v){
	if (v == .25)
	    {
		name = "Quarter";
		value = v;
	    }
	if (v == .10)
	    {
		name = "Dime";
		value = v;
	    }
	if (v == .5)
	    {
		name = "Nickel";
		value = v;
	    }
	if (v == .01)
	    {
		name = "Penny";
		value = v;
	    }
	fairness = 0;
	hcount = 0;
	tcount = 0;
	flipcount = 0;
    }
    public Coin(String n){
	if (n.equals("Quarter"))
	    {
		name = n;
		value = .25;
	    }
	if (n.equals("Dime"))
	    {
		name = n;
		value = .10;
	    }
	if (n.equals("Nickel"))
	    {
		name = n;
		value = .05;
	    }
	if (n.equals("Penny"))
	    {
		name = n;
		value = .01;
	    }
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
    public double getValue(){
	return value;
    }
    public String getName(){
	return name;
    }
    public int getFlipcount(){
	return flipcount;
    }
}
