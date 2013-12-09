import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int numflips;
    private int numheads;
    private double fairness;

    public Coin() {
	face = "heads";
	numflips = 0;
	numheads = 0;
	fairness = 0.5;
    }

    public void resetCount() {
	numflips = 0;
    }

    public String getCurrentFace() {
	String f;
	f = face;
	return f;
    }
	
}
