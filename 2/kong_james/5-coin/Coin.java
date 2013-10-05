import java.io.*;
import java.util.*;
//import Math.random.*;

public class Coin {
    private String face;
    private int hcount;
    private int tcount;
    private double fairness = 0.5;
    private int coin;
    private int Random;
    private int quarter = 25;
    private int dime = 10;
    private int nickel = 5;
    private int penny = 1;

    
    public Coin(String f) {
	face = f;
	hcount = 0;
	tcount = 0;
	fairness = 0.5;
    }

    public void perctHead(){
	Random = nextDouble();
    }
  
    public void reset(){
	hcount = 0;
	tcount = 0;
	fairness = 0;
    }
    public String getFace(){
	return face;
    }
    public Boolean flip(){
	if ( Random > fairness){
	    face = "head";}
	else {face = "tails";}
    }

}
