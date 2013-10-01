import java.io.*;
import java.util.*;

public class Coin {
    private int face, flips, fair;

    public int getFace() {
	return face;
    }

    public int getFlips() {
	return flips;
    }

    public int getFair() {
	return fair;
    }

    public void reset() {
	setFlips(0);
    }

    public void setFlips(int n) {
	flips = n;
    }
}