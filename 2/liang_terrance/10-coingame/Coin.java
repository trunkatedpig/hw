import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int headsflip, tailsflip;
    private double chance=0.5;
   
    public void reset(){
	headsflip = 0;
	tailsflip = 0;
    }

    public String getFace(){
	return face;
    }    
    
    public void faceFlip(){
	if (Math.random() <= chance){
	    face = "Heads";
	    headsflip = headsflip + 1;
		}
	else {
	    face = "Tails";
	    tailsflip = tailsflip + 1;
		}
    }

    public void setFace(String f){
	face = f;
    }

    public int getHeads(){
	return headsflip;
    }
    
    public int getTails(){
	return tailsflip;
    }
}
