import java.io.*;
import java.util.*;

public class Coin {
    
    private String face;
    private int count;
    private int heads;
    private int tails;
    private int probHeads;

    public void resetCount () {
	setCount(0);
    }

    public void setCount (int a) {
	count = a;
    }

    public String getFace () {
	String f;
	f = face + " ";
	return f;
    }
}
