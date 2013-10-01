import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int flips,heads;
    private int fairness;

    public void resetCount() {
	flips = 0;
	heads = 0;
	fairness = 0;
    }

    // setting default face for sake of testing
    public void setFace() {
	face = "Head";
    }

    public void addCount() {
	flips = flips + 1;
    }

    /*

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return flips - heads;
    }

    */

    public int getFlips() {
	return flips;
    }

    public String getFace() {
	return face;
    }

}
