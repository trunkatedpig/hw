import java.io.*;
import java.util.*;

public class Coin{
    private double value;
    private String name, type;


    public Coin(){
	this.name = "quarter";
	this.value = 0.25;
    }
    public Coin(String name, double value){
	this.name = name;
	this.value = value;
    }

    public String getName(){
	return name;
    }
    public double getValue(){
	return value;
    }

}
