import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips,heads,tails;
    private int fairness;

    public Coin(String n) {
	face = n;
    }

    public void resetCount() {
	flips = 0;
    }

    public String getFace() {
	return face;
    }
}