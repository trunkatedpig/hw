import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips, heads, tails, fairness;

    public String setFace(String facevalue) {
	face = facevalue;
	return face;
    }

    public int Reset() {
	heads = 0;
	tails = 0;
	return heads;
    }
    
    public String getFace() {
	return face;
    }

}
