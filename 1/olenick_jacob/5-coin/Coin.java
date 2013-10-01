import java.io.*;
import java.util.*;

public class Coin {
    private String heads;
    private int countH;
    private int countT;
    private double fairness;

    public int getHeads() {
	return countH;
    }
    public int getTails() {
	return countT;
    }
    public String getFace() {
	return heads;
    }

    public void reset () {
	countH = 0;
	countT = 0;
    }
}