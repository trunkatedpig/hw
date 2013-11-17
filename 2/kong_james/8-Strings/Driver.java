import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args){
	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("james kong"));
	System.out.println(s.bondify("james kong"));
	System.out.println(s.PigLatinify("amazing"));
	System.out.println(s.PigLatinify("bubblegum"));
			   
    }
}
