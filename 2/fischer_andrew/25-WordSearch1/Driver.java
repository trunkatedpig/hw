import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	WordSearch w = new WordSearch(15,40);

	//	w.AddWordSW(7,9,"sWast");
	//	w.AddWordNE(7,17,"nEast");
	//	w.AddWordNW(7,17,"nWast");
	
	//	System.out.println(w);
	
	//	w.fill();
	//      System.out.println(w);
	

	w.loadWords("wordlist");
	w.fill();
	System.out.println(w);       

    }
}
