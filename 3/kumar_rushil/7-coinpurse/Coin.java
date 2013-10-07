import java.io.*;
import java.util.*;

public class Coin {

    private double value;
    private String name;

    public Coin (double worth, String type){
	value = worth;
	name = type;
    }
    public double getValue(){
	return value;
    }
}

