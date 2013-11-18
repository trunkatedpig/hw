<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int flips;
    private int heads;
    private int tails;

    public void setFlips(int f){
	flips = f;
    }

    public void setHeads(int h){
	heads = h;
    }

    public void setTails(int t){
	tails = t;
    }
	
    public void resetFlips(){
	setFlips(0);
    }

    public void resetHeads(){
	setHeads(0);
    }

    public void resetTails(){
	setTails(0);
    }

    public String getFace(){
	return face;
    }
=======
public class Coin {
    private String face;
    private String name;
    private double amount;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize

    public void initCoin(String f, double p, String n, double a) {
	face = f;
	tosses=0;
	heads=0;
	prob=p;
	name=n;
	amount=a;
    }


    public Coin(String n, double a) {
	initCoin("Heads",0.5,n,a);
    }


    public Coin(String f,String n,double a) {
	initCoin(f,0.5,n,a);
    }

    public void reset(){
	tosses = 0;
	heads = 0;
    }

    public String toss(){
	if (Math.random() > prob){
	    face = "Heads";
	    heads = heads + 1;
	} 
	else{
	    face = "Tails";
	}
	tosses = tosses + 1;
	return getFace();
    }

    public void setRandProb(){
	prob = Math.random();
    }

    public String getFace() {
	return face;
    }

    public double getAmount(){
	return amount;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }
    
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
