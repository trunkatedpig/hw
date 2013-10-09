import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {

	//StringStuff s = new StringStuff();
	
	//System.out.println(s.stringCap("Rocky Balboa"));
	
	//System.out.println(s.bondify("Rocky Balboa"));

	Piglatin p = new Piglatin();

	System.out.println(p.firstLetter("string") + "yay");
	
	System.out.println(p.piglatinfy("ate"));
	System.out.println(p.piglatinfy("hello"));
	System.out.println(p.piglatinfy("them"));
    }
}
