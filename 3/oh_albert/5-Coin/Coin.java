import java.io.*;
import java.util.*;

public class Coin {
    
    private String faceValue = "Heads";
    private int heads, tails, flips;
    private double probHead = 0.5;

    public void resetValues(String f, Double p) {
	heads = 0;
	tails = 0;
	flips = 0;
	faceValue = f;
	probHead = p;
    }

    public Coin() {
	resetValues("Heads","0.5");
    }

    public Coin(String f) {
	resetValues(f,0.5);
    }
    
    public String getHead() {
	return faceValue;
    }

    public boolean equals(Coin other) {
	return faceValue.equals(other.getFace());
    }
}
