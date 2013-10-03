import java.io.*;
import java.util.*;
public class Coin {
    private String face;
    private double  flips, heads, fairness;
    private Random r = new Random();
    public Coin() {
	setFace("heads");
	setFlips(0);
	setHeads(0);
	    }
    public void setFlips(double n){
	flips = n;
    }
    public void Flip(){
	if (r.nextInt(2) == 0)
		 {setHeads(heads + 1);
		  setFlips(flips + 1);
		 }
	else {
	    setFlips(flips + 1);
	}
    }
    public void setFairness(double n, double p, double q){
	fairness = (n / p)*q ;
    }
    public void Fairness(){
	setFairness(heads , flips , 100);
    }
    public double  getFairness(){
	return fairness;
    }
    public void setHeads(double n){
	heads = n;
    }
    public void setFace (String s){
	face = s;
    }
    public void ResetCounts(){
	setFlips(0);
	setHeads(0);
    }
    public double getFlips(){
	return flips;
    }
    public double getHeads(){
	return heads;
    }
    public String getFace(){
	return face;
    }

}
