import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int flips;
    private int heads;
    private int fair;

    public void reset() {
	flips = 0;
	heads = 0;
    }
    public String getFace() {
	return face;
    }
    public int getFlips() {
	return flips;
    }
    public int getHeads() {
	return heads;
    }
    public int getfair() {
	return fair;
    }
}