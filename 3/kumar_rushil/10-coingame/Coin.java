import java.util.*;
import java.io.*;
public class Coin {

    private String face;
    private int flips, heads, tails;
    private double percenthead = 0.5;
    Random r = new Random();
    public void setFace(){
if ((r.nextDouble()) <= percenthead)
face = "Head";
else
            face = "Tails"; 
    }

    public void addCount(){
flips = flips + 1;
    }

    public void resetCount(){
flips = 0;
heads = 0;
tails = 0;
    }

    public String getFace(){
return face;
    }

    public int getFlips(){
return flips;
    }
}