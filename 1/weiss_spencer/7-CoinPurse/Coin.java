import java.io.*;
import java.util.*;

 public class Coin{
    private String face;
    private int flips, heads;
    private int fairness;
    private int value;
    private String name;

    public Coin(int v) {
	value = v;
	if (v == 1) {
	    name = "penny";
	}
	if (v == 5) {
	    name = "nickel";
	}
	if (v == 10) {
	    name = "dime";
	}
	if (v == 25) {
	    name = "quarter";
	}
    }

public Coin(String n){
	name = n;
	if (n == "penny"){
	    value = 1;
	}
	else if (n == "nickel"){
	    value = 5;
	}
	else if (n == "dime"){
	    value = 10;
	}
	else{
	    value = 25;
	}
    }

    public int getValue(){
	return value;
    }

    public void reset(){
	flips = 0;
	heads = 0;
	fairness = 50;
	face = "heads";
	name = "penny";
	value = 1;
    }

}

