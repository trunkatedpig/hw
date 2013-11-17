import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int headsflip, tailsflip;
    private float chance;
   
    public void reset(){
	headsflip = 0;
	tailsflip = 0;
    }

    public String getFace(){
	return face;
    }    
    
    // This is to test the code above
    public void setFace(String f){
	face = f;
    }

    public void flipHeads(){
	headsflip = headsflip + 1;
    }

    public void flipTails(){
	tailsflip = tailsflip + 1;
    }

    public String getFlips(){
	return "Heads flipped " + headsflip + " times. \n Tails flipped " + tailsflip + " times.";
    }
}
