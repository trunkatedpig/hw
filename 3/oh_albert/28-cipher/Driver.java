import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	encode e1,e2,e3;

	e1 = new encode();
	System.out.println("The first conversion: " + e1.encode("test",1));

	e2 = new encode();
	System.out.println("The second conversion: " + e2.encode("second test",3));

	e3 = new encode();
	System.out.println("Testing looping back to a: " + e3.encode("xyz",4));
		    
    }
}
