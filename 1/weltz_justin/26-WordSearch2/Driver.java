import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(15,30);
	/*System.out.println(w);
	w.addWordRandomLoc("defenistration");
	w.addWordRandomLoc("hello");
	w.addWordRandomLoc("world");
	w.addWordRandomLoc("goat");
	w.addWordRandomLoc("turtle");
	w.addWordRandomLoc("koala");
	w.addWordRandomLoc("squid");
	w.addWordRandomLoc("doggie");*/
	//System.out.println(w);
	//w.fillInBlanks();
	//System.out.println(w);
	//w.readWords("wordList");
	w.makePuzzle(29);
	System.out.println("ANSWER KEY");
	System.out.println(w);
	System.out.println("PUZZLE");
	System.out.println(w.getAnswer());
	w.fillInBlanks();
	System.out.println(w);
	    
    }

}
