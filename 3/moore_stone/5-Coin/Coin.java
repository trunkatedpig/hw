import java.io.*;
import java.util.*;

    public class Coin{
	private int flips,fair,heads,tails;
	private String face;
	
	public void resetFace(){
	    face = "";
	}
	
	public void resetFlips(){
	    flips = 0;
	}

	public void resetFair(){
	    fair = 0;
	}

	public void resetHeads(){
	    heads = 0;
	}

	public void resetTails(){
	    tails = 0;
	}

	public void resetAll(){
	    resetFace();
	    resetFlips();
	    resetFair();
	    resetHeads();
	    resetTails();
	}

	public void upOne(int n){
	    n = n + 1;
	}
	
	public void upOneH(){
	    upOne(heads);
	    upOne(flips);
	    face = "heads";
	}

	public void upOneT(){
	    upOne(tails);
	    upOne(flips);
	    face = "tails";
	}
	
	public String getFace(){
	    return face;
	}

	public void getFair(){
	    fair = (heads / flips) - (tails / flips);
	}
       
	public Coin(String currentFace){
	    flips = 0;
	    face = currentFace;
	    heads = 0;
	    tails = 0;
	    fair = 0;
	}
	
    }
