import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	WordSearch w = new WordSearch(15,40);

<<<<<<< HEAD
	w.AddWordSE(7,9,"sEast");
	w.AddWordSW(7,9,"sWast");
	w.AddWordNE(7,17,"nEast");
	w.AddWordNW(7,17,"nWast");
	
	System.out.println(w);
	
	w.fill();
	System.out.println(w);
	
=======
	w.loadWords("wordlist");
	System.out.println(w);       
>>>>>>> a16d4eaff2e40dd14fb647c7f97bb4cb1c51c158
    }
}
