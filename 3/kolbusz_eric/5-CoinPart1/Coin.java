import java.io.*;
import java.util.*;

public class Coin {
    public String face;
    public int flips,heads,tails;
    public double fairness;

    public void resetCount() {
	flips = 0;
    }

    public String getFace() {
	return face;
    }

}
