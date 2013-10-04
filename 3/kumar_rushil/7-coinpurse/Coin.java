import java.io.*;
import java.util.*;

public class Coin {

    private int value;
    private String name;

    public Coin (int worth, String type){
	value = worth;
	name = type;
    }
    public int getValue(){
	return value;
    }
}

