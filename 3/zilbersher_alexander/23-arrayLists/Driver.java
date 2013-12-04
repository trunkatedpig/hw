import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        ALs AL = new ALs();
        ArrayList<String> a = new ArrayList<String>();
	ArrayList<String> b = new ArrayList<String>();
	ArrayList<String> c = new ArrayList<String>();
        System.out.println(AL.addBasic(a));
	System.out.println(AL.addHard(b));
	//buildHard (from front) is much longer than buildBasic (from back) 
	
	System.out.println(AL.removeFront(a));
	System.out.println(AL.removeBack(b));
	//removeFront is almost the same amount longer than removeBack
	//as buildHard was longer than buildBasic

	c.add("wow");
	c.add("Much_Compsci");
	c.add("So_Computer");
	c.add("Shibe:");
	AL.reverse(c);
	System.out.println(c);	
    }
}
