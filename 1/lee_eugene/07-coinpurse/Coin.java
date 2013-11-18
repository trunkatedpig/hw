import java.io.*;
import java.util.*;

public class Coin {
    private int value;
    private String name;
    
    // Constructor
    public Coin(int v) {
	value = v;
	if (v = 1) {
	    name = "penny";
	}
	if (v = 5) {
	    name = "nickel";
	}
	if (v = 10) {
	    name = "dime";
	}
	if (v = 25) {
	    name = "quarter";
	}
}