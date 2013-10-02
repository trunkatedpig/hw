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
}
