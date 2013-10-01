import java.io.*;
import java.util.*;

public class Coin{
    
    private String face;
    private int flipsh;
    private int fairness;

    public Coin(){
	face = "heads";
	flipsh = 0;
	fairness = 0;
    }

    public void reset() {
	flipsh = 0;
    }

    public String getFace(){
	return face;
    }
}
