import java.io.*;
import java.util.*;

public class Coin {
    private int n;
    private String name;
    
    //This purse will only hold real american coins that are still in use

    public Coin(int n) {
	value = n;
	if (n = 1) {
	    name = "penny";
	}
	if (n = 5) {
	    name = "nickel";
	}
	if (n = 10) {
	    name = "dime";
	}
	if (n = 25) {
	    name = "quarter";
	}
	if (n = 50){
	    name = "half dollar"
	}
	if (n = 1000){
	    name = "dollar coin"
	}
		
}
