import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(15,30);
<<<<<<< HEAD
	System.out.println(w);
	w.addWordRandomLoc("defenistration");
	w.addWordRandomLoc("hello");
	w.addWordRandomLoc("world");
	w.addWordRandomLoc("goat");
	w.addWordRandomLoc("turtle");
	w.addWordRandomLoc("koala");
	w.addWordRandomLoc("squid");
	w.addWordRandomLoc("doggie");
	//System.out.println(w);
	//w.fillInBlanks();
	//System.out.println(w);
=======
	
	System.out.println(w);
	//w.addWordRandomLoc("defenistration");
	//w.addWordRandomLoc("hello");
	//w.addWordRandomLoc("world");
	//w.addWordRandomLoc("goat");
	//w.addWordRandomLoc("turtle");
	//w.addWordRandomLoc("koala");
	//w.addWordRandomLoc("squid");
	//w.addWordRandomLoc("doggie");
	
	ArrayList thing = new ArrayList();
	thing = (w.fillFromFile());
	System.out.println(w);
	w.fillInBlanks();
	for (int i=0;i<20;i++)
	    System.out.println();
	
	System.out.println(w);
	System.out.println(thing);
	
>>>>>>> feda4328dad8966facd10ef24bb7a11c293f2775
    }

}
