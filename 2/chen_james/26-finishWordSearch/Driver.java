import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	WordSearch w = new WordSearch(20,50);
	System.out.println(w);
	w.insertWords(8);
	System.out.println(w);
	w.fillBlanks();
	System.out.println(w);
	


    }
}
