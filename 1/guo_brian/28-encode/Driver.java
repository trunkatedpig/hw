import java.io.*;
import java.util.*;

public class Driver { 
    
    public static void main (String[] args) {
	Encode x = new Encode();
	String y = "abcdef19285'";
	System.out.println(x.encode(y,25));
    }
}
