import java.io.*;
import java.util.*;
<<<<<<< HEAD
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

=======
//worked with Venessa
public class Coin{
    private String face,name;
    private int percent; //percent = probability of heads
    private double amount,heads,tails,flips;
    private Random r = new Random();
    
    public void setCoin(){
	face = "Heads";
	name = "Quarter";
	amount = 0.25;
	resetCount();
	percent = 50;
	    }
    public void setCoin(String face,int percent,String name,double amount){
	face = face;
	name = name;
	amount = amount;
	percent = percent;
	resetCount();
    }
    
    public void coinFlip(){
	flips = flips + 1;
	if (r.nextInt(100) < percent)
	    {heads = heads + 1;
		face = "Heads";
		    }
	else {tails = tails + 1;
	    face = "Tails";
		}
    }
    
    public void resetCount(){
	heads = 0;
	tails = 0;
	flips = 0;
    }
    
    ////////////

    public String getFace(){
	return face;
    }
    public double getHeads(){
	return heads;
    }
    public double getTails(){
	return tails;
    }
    public double getFairness(){
	return heads/flips;
    }
    public double getAmount(){
	return amount;
    }
    
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
