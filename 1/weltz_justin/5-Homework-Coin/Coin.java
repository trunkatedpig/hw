import java.io.*;
import java.util.*;
public class Coin {
    private String face;
    private int flips, heads, fairness;
    public Coin() {
	setFace("heads");
	setFlips(0);
	setHeads(0);
	    }
    public void setFlips(int n){
	flips = n;
    }
    public void setHeads(int n){
	heads = n;
    }
    public void setFace (String s){
	face = s;
    }
    public void ResetCounts(){
	setFlips(0);
	setHeads(0);
    }
    public int getFlips(){
	return flips;
    }
    public int getHeads(){
	return heads;
    }
    public String getFace(){
	return face;
    }

}
