import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	WordSearch w = new WordSearch(15,40);

<<<<<<< HEAD
	w.loadWords("wordlist");
	System.out.println(w);       
=======
	w.AddWordSE(7,9,"sEast");
	w.AddWordSW(7,9,"sWast");
	w.AddWordNE(7,17,"nEast");
	w.AddWordNW(7,17,"nWast");
	
	System.out.println(w);
	
	w.fill();
	System.out.println(w);
	
>>>>>>> 102f62e2395367dd85aa22a5f72d106331ea491c
    }
}
