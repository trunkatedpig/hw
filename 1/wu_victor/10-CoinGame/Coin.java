import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private double prob;

    public Coin () {
	face = "Heads";
    }

    public void flip () {
	Random r = new Random();
	prob = r.nextDouble();

       	if ( prob > 0.5 ) {
	    setFace("Heads");
	}
	else {
	    setFace("Tails");
	}
    }
    
    public void setFace(String s) {
	face = s;
    }

    public String getFace () {
	return face;
    }
}
