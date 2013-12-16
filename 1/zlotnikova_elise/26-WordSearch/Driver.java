import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) { 
	WordSearch w = new WordSearch(20,20);
	w.makePuzzle(5);
	System.out.println(w);
	w.fillInBlanks();
	System.out.println(w);
	System.out.println(w.getFinalWordList());

    }
}
