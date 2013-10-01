import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips, heads, tails;
    private int fairness;

    public void resetCount (){
        setFace ("");
	setHeads (0);
	setTails (0);
    }

    public void setFace (String f) {
	face = f;
    }
    public void setHeads (int h) {
	heads = h;
    }    

    public void setTails (int t) {
        tails = t;
    }
    public String getFace () {
	return face;
    }
}
