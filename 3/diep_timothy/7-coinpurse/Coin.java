import java.io.*;
import java.util.*;

public class Coin {
     
    private String name;
    private double value;

    public Coin(String n, double v) {
	name = n;
	value = v;
    }

    public Coin(double v) {
	if (v == .25) {
	    name = "Quarter";
	    value = .25;
	} else if (v == .10) {
	    name = "Dime";
	    value = .10;
	} else if (v == .5) {
	    name = "Nickel";
	} else {
	    name = "Penny";
	}
    }

    public String getName() {
	return name;
    }

    public double getValue() {
	return value;
    }
}
