import java.io.*;
import java.util.*;

public class Driver { 
    
    public static void main (String[] args) {
	Encode x = new Encode();
	String y = "hello this is my name";
	System.out.println(x.encode(y,6));
    }
}
