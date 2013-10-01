import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int tails;
    private int fairness;
    public Coin() {
	face = "Heads";
	flips = 10;
	heads = 3;
	tails = 7;
	fairness = 50;
    }
    public void resetFlips(){
	flips = 0;
    }
    public String getFace() {
	return face;
    }
}
