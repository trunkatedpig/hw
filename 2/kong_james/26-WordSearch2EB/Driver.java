import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
        WordSearch w = new WordSearch(15,40);
	System.out.println(w);
	w.createPuzzle(5);
	System.out.println(w);
	w.fillBlanks();
	System.out.println(w);
    }
}
