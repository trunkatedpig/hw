import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int heads, tails, totalflips, headpercent;

    public void resetCount() {
        totalflips = 0;
        heads = 0;
        tails = 0;
        headpercent = 0;
    }

    public String getFace() {
        return face;
    }

    public void setCount() {
        totalflips = 5;
        heads = 2;
        tails = 3;
        headpercent = 20;
    }

    public int getTotalFlips() {
        return totalflips;
    }

    public int getHeads() {
        return heads;
    }

    public int getTails() {
        return tails;
    }

    public int getHeadPercent() {
        return headpercent;
    }
}
