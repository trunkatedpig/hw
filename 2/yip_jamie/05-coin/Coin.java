import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int heads,tails,flips;
    private double probability;

    public void resetCount() {
	flips = 0;
	heads = 0;
	tails = 0;
    }

    public String getFace(){
	return face;
    }
}
